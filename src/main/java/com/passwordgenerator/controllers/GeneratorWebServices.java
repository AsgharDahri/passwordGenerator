package com.passwordgenerator.controllers;

import com.passwordgenerator.services.GeneratorPasswordService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class GeneratorWebServices {
    @CrossOrigin
    @GetMapping("/generatePassword")
    public String generatePassword(){
        return GeneratorPasswordService.generatePassword();
    }
}
