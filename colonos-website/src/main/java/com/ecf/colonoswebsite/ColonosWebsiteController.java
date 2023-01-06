package com.ecf.colonoswebsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColonosWebsiteController {
    
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World omg bruh aw hell naw man wtf who invited this guy!";
    }
    @GetMapping("/error")
    public String error(){
        return "no se encontro nada :(";
    }
    
}
