package com.devops.devops.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
    @RequestMapping("/")
    String hellow()
    {
        System.out.println("<<< Hola >>>>");
        System.out.println("<<< Mundo  >>>>");
        return "Hello World!";

    }
}