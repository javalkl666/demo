package com.loomo.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "jenkins")
public class jenkinsController {

    @RequestMapping(value = "index")
    public String test(){
        return "hello jenkins";
    }
}
