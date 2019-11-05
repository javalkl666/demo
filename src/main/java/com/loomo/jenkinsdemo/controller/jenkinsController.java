package com.loomo.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinsController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String test(){
        return "jenkins 123456";
    }
}
