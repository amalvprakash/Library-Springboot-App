package com.nest.LibraryappBackend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class LibraryController {

    @PostMapping("/")
    public String Home(){
        return "home page";
    }

    @PostMapping("/addBooks")
    public String AddBooks(){
        return "Add books";
    }
}
