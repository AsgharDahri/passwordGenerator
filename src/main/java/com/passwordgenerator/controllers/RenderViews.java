package com.passwordgenerator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class RenderViews {
    @RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("home");
    }
}
