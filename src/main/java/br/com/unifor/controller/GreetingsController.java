package br.com.unifor.controller;

import io.micronaut.http.annotation.*;

@Controller("/greetings")
public class GreetingsController {

    @Get(uri = "/", produces = "text/plain")
    public String index() {
        return "Example Response 1234";
    }
}