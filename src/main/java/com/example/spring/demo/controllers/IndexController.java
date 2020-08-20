package com.example.spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/app") //localhost:8080/app/index
public class IndexController {

    @GetMapping({"/index", "/", "", "/home"})
    public String index(Model model){
        model.addAttribute("titulo", "Hola Spring Framework con Model");
        return "index";
    }
}
