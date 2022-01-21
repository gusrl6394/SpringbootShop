package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {
    @GetMapping(value = "/")
    public String index(Model model){
        return "/index";
    }

    @GetMapping(value = "/content")
    public String content(Model model){
        return "/content";
    }
}
