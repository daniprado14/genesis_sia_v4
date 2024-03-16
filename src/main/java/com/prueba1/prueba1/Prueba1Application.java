package com.prueba1.prueba1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Prueba1Application {

    public static void main(String[] args) {
        SpringApplication.run(Prueba1Application.class, args);
    }
    @GetMapping("hola")
    public String holamundo(){
        return "hola mundo i am happy";
    }
}
