package org.example.gdziedrinki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {
    @GetMapping("/")
    public String Witaj() {
        return "Witaj";
    }

}
