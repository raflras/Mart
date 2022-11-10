package com.example.Mart.controller;

import com.example.Mart.model.network.Header;
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

    @GetMapping("/header") // localhost:8080/api/header
    public Header getHeader(){
        return Header.builder().resultCode("ok").description("test").build();
    }
}
