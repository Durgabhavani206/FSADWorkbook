package com.skill.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/admin/add")
    public String add() {
        return "Admin can add";
    }

    @GetMapping("/admin/delete")
    public String delete() {
        return "Admin can delete";
    }

    @GetMapping("/employee/profile")
    public String profile() {
        return "Employee profile";
    }
}