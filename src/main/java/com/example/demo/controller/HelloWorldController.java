package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

	// 这里是注释，test
    @RequestMapping("/say.html")
    @ResponseBody
    public String say(){
        return "HelloWorld";
    }
}