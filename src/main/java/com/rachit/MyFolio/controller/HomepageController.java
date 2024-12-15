package com.rachit.MyFolio.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomepageController {
    @GetMapping("/")
    public String homepage(){
        return "This is the Home page";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome User";
    }
}
