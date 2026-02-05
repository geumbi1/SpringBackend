package com.example.demo.springMVC.variousRequest.controller;

import com.example.demo.springMVC.variousRequest.UserRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RequestBodyController {

    @PostMapping("/users")
    @ResponseBody
    public String create(@RequestBody   UserRequest request) {
        return "name=" + request.getName() + ", age=" + request.getAge();
    }
}