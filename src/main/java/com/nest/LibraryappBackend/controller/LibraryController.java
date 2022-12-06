package com.nest.LibraryappBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/issueBooks")
    public String IssueBooks(){
        return "Issue books";
    }

    @PostMapping("/deleteBook")
    public String DeleteBook(){
        return "Delete books";
    }

    @PostMapping("/adduser")
    public String AddUser(){
        return "Add User";
    }

    @PostMapping("/editUser")
    public String EditUSer(){
        return "Edit User";
    }

    @PostMapping("/editBook")
    public String EditBook(){
        return "Edit Book";
    }

    @GetMapping("/viewallbooks")
    public String ViewAllBooks(){
        return "View All Books";
    }
}
