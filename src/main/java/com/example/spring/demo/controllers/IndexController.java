package com.example.spring.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class IndexController {

    //@RequestMapping(value="/index", method = RequestMethod.GET)
    //@RequestMapping(value="/index")
    //@GetMapping(value="/index")
    @GetMapping("/index")
    //@GetMapping({"/index", "/", "/home"})
    //@PostMapping(value="/index")
    public ModelAndView index(ModelAndView mv){

        mv.addObject("titulo", "Hola Spring FrameWork con ModelAndView");
        mv.setViewName("index");
        return mv;
    }
}
