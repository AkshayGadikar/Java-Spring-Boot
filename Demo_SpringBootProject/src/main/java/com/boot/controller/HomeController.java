package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //identify as rest controller
public class HomeController {

    @RequestMapping("/")   //request mappping for root URL
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
