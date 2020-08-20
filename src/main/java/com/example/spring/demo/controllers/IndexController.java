package com.example.spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class IndexController {

    //@RequestMapping(value="/index", method = RequestMethod.GET)
    //@RequestMapping(value="/index")
    //@GetMapping(value="/index")
    @GetMapping("/index")
    //@GetMapping({"/index", "/", "/home"})
    //@PostMapping(value="/index")
    public String index(Map<String, Object> map){

        map.put("titulo", "Hola Spring FrameWork con Map");
        return "index";
    }
}
