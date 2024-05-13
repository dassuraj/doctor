package com.codewithsuraj.service;

import com.codewithsuraj.model.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface DoctorService {
    List<Doctor> getAll();
    Doctor getDoctorById(long id);
    void saveDoctor(Doctor doctor);
    Doctor updateDoctor(Doctor doctor ,long id);
    void deleteDoctor(long id);
}
