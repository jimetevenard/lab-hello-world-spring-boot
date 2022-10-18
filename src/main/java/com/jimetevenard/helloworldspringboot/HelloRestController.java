package com.jimetevenard.helloworldspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    private final CapitalizeService capitalizeService;

    HelloRestController(CapitalizeService capitalizeService){
        this.capitalizeService = capitalizeService;
    }

    @GetMapping("/")
    public String hello(){
        return capitalizeService.capitalize("<h1>Salut, toi !</h1>");
    }

}
