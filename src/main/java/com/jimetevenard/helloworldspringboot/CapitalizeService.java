package com.jimetevenard.helloworldspringboot;

import org.springframework.stereotype.Service;

@Service
public class CapitalizeService {

    /**
     * @return The given input, capitalized.
     */
    public String capitalize(String input){
        return input.toUpperCase();
    }
}
