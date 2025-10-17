package com.uninter.apitarefas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.uninter.apitarefas") 
@SpringBootApplication
public class ApiTarefasApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiTarefasApplication.class, args);
    }
}
