package com.example.spring.demo.controllers;

import com.example.spring.demo.models.services.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//Recordar que el Controller interactua con los datos, services


@Controller
public class IndexController {

    //private IndexService myService = new IndexService();

    @Autowired
    private IndexService myService;

    @GetMapping({"/index", "/", "/home"})
    public String index(Model model){
        model.addAttribute("object", myService.operation());
        return "index";
    }
}
