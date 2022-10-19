package com.cimb.rachmad.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RachmadController {
    @RequestMapping("/rachmad")
    public String rachmad(){
        return "Hello";
    }

    @RequestMapping("/")
    public String index(){
        return "Hello_index";
    }
    @GetMapping("/message")
    public String message(Model model){
        model.addAttribute("message","hi from costum messgae");
        return "message";
    }
}
