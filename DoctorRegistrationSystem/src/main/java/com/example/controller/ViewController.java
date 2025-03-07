package com.example.controller;

import com.example.model.Doctor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/form")
    public String showRegistrationForm(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "registration"; // "registration.html" templates folder se load hoga
    }
    
    
}
