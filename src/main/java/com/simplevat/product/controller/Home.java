package com.simplevat.product.controller;

import com.simplevat.product.ProductApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Home {
    @GetMapping
    public String home()
    { return "Simple Vat Product module Application is working !!!"+new Date();
    }
}
