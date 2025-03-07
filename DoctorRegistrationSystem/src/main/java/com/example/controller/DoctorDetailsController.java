package com.example.controller;

import com.example.model.Doctor;
import com.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorDetailsController {

    @Autowired
    private DoctorService doctorService;

    // Endpoint to display specific doctor details by id
    @GetMapping("/doctors/details")
    public String showDoctorDetails(@RequestParam("id") Long id, Model model) {
        Doctor doctor = doctorService.getDoctorById(id);
        model.addAttribute("doctor", doctor);
        return "doctor-details"; // Refers to doctor-details.html in templates folder
    }
}
