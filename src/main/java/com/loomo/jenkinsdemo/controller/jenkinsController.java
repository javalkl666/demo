package com.loomo.jenkinsdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class jenkinsController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String test(){
        return "192.168.1.54自动部署成功";
    }
}
