package com.codewithsuraj.controller;

import com.codewithsuraj.model.Doctor;
import com.codewithsuraj.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    @GetMapping(value = "/get-all-doctor")
    public List<Doctor> getAllDoctor(){
        return doctorService.getAll();
    }
    @GetMapping(value = "/get-doctor-by-{id}")
    public Doctor getDoctorById(long id){
        return doctorService.getDoctorById(id);
    }
    @PostMapping(value = "/save-doctor")
    public void saveDoctor(Doctor doctor){
        doctorService.saveDoctor(doctor);
    }
    @PutMapping(value = "/update-doctor")
    public Doctor updateDoctor(Doctor doctor,long id){
        return doctorService.updateDoctor(doctor,id);
    }
    @DeleteMapping(value = "/delete-doctor")
    public void deleteDoctor(long id){
        doctorService.deleteDoctor(id);
    }
}
