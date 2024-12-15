package com.rachit.MyFolio.controller;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
@RequestMapping("/user")
public class UsersController {
    @GetMapping("/profile")
    public String profile(OAuth2AuthenticationToken token, Model model) {
        Map<String, Object> attributes = token.getPrincipal().getAttributes();
        model.addAttribute("name", attributes.get("name"));
        model.addAttribute("email", attributes.get("email"));
        model.addAttribute("picture", attributes.get("picture"));
        return "user-profile";
    }

}
