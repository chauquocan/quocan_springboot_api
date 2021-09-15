package com.quocan.quocan_springboot_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String HomePage(){
        return "Chau Quoc An - 18084851";
    }
}
