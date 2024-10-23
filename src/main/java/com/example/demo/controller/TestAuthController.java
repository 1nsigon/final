package com.example.demo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestAuthController
{
    @PreAuthorize("hasRole('USER')")
    @GetMapping("/hiUser")
    public String helloUser()
    {
        return "hi user";
    }

    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/hiAdmin")
    public String helloAdmin()
    {
        return "hi admin";
    }
}
