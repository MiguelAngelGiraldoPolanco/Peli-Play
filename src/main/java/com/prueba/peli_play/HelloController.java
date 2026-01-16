package com.prueba.peli_play;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final PeliPlayAiService aiService;

    public HelloController(PeliPlayAiService iaService){
        this.aiService = iaService;
    }

    @GetMapping("/")
    public String hello(){
        return this.aiService.generateGreeting();
    }
}
