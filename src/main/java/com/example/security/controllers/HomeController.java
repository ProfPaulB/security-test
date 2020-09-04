package com.example.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String root() {
        return "index";
    }

    @GetMapping("/2")
    public String root2() {
        return "index2";
    }

    @GetMapping("/user")
    public String userIndex() {
        return "/secured/user/index";
    }

    @GetMapping("/manager")
    public String managerIndex() {
        return "/secured/manager/index";
    }

    @GetMapping("/secured")
    public String secureIndex() {
        return "/secured/gateway";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }

}
