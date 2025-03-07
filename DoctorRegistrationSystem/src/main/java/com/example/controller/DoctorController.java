package com.example.controller;

import com.example.model.Doctor;
import com.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    // Create Doctor (POST)
    @PostMapping("/register")
    public Doctor registerDoctor( Doctor doctor) {
        return doctorService.saveDoctor(doctor);
    }

    // Get All Doctors (GET)
    @GetMapping("/list")
    public List<Doctor> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    // Get Doctor by ID (GET)
    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        return doctorService.getDoctorById(id);
    }
}
