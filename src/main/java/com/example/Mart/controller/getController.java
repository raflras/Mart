package com.example.Mart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mart")
public class getController {

    @GetMapping("/test")
    public String test(){
        return "연결 완료";
    }
}
