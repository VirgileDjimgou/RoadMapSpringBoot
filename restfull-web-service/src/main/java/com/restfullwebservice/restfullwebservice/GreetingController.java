package com.restfullwebservice.restfullwebservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = " ";
    private static AtomicLong counter = new  AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    public info(){
        // public
    }

    public String testcontroller(){

        // fonction de test et de parsing des donnees entrantes  ...
        String InData = "test dat ";
        String OutData = "Test data Out";
        String Returndata = "";

        return  Returndata;
    }

}
