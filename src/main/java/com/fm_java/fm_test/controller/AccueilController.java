package com.fm_java.fm_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccueilController {
    @GetMapping("/")
    public String accueil() {
        return "accueil";
    }
}

