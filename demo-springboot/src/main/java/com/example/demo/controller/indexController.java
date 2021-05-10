package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "taobr")
@Controller
public class indexController {
    @GetMapping("hello")
    public String hello(){
        return "/helloworld";
    }

    @PostMapping("play")
    @ResponseBody
    public String watch(String name){
        if (name !=null && !name.isEmpty()){
           name= name.substring(0,name.length()-1);
        }
        return name;
    }
}
