package com.lowes.psol.inventory.inventorymanagement.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class WelcomeController {

    @PostMapping("hello")
    public String getMsg(@RequestBody(required = false) String hi){
        return "Hi all...!!";
    }
}
