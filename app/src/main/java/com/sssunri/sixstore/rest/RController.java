package com.sssunri.sixstore.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RController {
    @GetMapping("/")
    public String sayHello() {
        return "hello sixstore";
    }
}
