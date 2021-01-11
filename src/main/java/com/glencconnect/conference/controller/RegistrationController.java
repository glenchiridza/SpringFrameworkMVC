package com.glencconnect.conference.controller;

import com.glencconnect.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by glenc on Jan 2021
 **/
@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){

        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration, BindingResult result){
        System.out.println("registration: " + registration.getName());
        if (result.hasErrors()) {

            System.out.println("There were some errors");
            return "registration";
        }

        return "redirect:registration";
    }
}

