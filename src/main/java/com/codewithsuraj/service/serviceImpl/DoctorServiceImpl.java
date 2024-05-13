package com.codewithsuraj.service.serviceImpl;

import com.codewithsuraj.model.Doctor;
import com.codewithsuraj.repository.DoctorRepository;
import com.codewithsuraj.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;
    @Override
    public List<Doctor> getAll() {
        return doctorRepository.findAll();
    }

    @Override
    public Doctor getDoctorById(long id) {
        return doctorRepository.findById(id).get();
    }

    @Override
    public void saveDoctor(Doctor doctor) {
         doctorRepository.save(doctor);
    }

    @Override
    public Doctor updateDoctor(Doctor doctor, long id) {
        boolean isExist =doctorRepository.existsById(id);
        if (isExist){
            Doctor doctor1=doctorRepository.findById(id).get();
            doctor1.setFirstName(doctor.getFirstName());
            doctor1.setLastName(doctor.getLastName());
            doctor1.setDob(doctor1.getDob());
            doctor1.setGender(doctor.getGender());
            doctor1.setEmail(doctor.getEmail());
            doctor1.setSpecialization(doctor.getSpecialization());
            return doctorRepository.save(doctor);
        }
        return null;
    }

    @Override
    public void deleteDoctor(long id) {
        doctorRepository.deleteById(id);
    }
}
