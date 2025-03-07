package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LookupController {
    
    @GetMapping("/doctors/lookup")
    public String showLookupForm() {
        return "doctor-lookup";  // This will load doctor-lookup.html from the templates folder
    }
}
