package com.fm_java.fm_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

  @GetMapping("/api/hello")
  public String hello(@RequestParam(defaultValue = "monde") String nom) {
    return "Bonjour, " + nom + " !";
  }
}
