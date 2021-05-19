package com.gap.arch.akstestphil.controller;

import com.gap.arch.akstestphil.service.PhilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhilController {

    @Autowired
    private PhilService philService;

    @GetMapping
    public String hello() {
        return philService.getGreeting() + " " + philService.getDateTime();
    }
}
