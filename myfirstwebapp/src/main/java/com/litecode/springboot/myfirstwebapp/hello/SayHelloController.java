package com.litecode.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SayHelloController {

    @RequestMapping("say-hello-jsp")
    public String SayHello(){
        return "SayHello";
    }
}
