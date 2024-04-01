package com.gambit.Gambit.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;


@Controller
public class CErrorController implements ErrorController {
    @GetMapping("/error")
    public String error() {
        //do something like logging
        return "error";
    }
}