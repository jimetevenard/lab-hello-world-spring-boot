package com.jimetevenard.helloworldspringboot;

import org.springframework.stereotype.Service;

@Service
public class CapitalizeService {

    public String capitalize(String input){
        return input.toUpperCase();
    }
}
