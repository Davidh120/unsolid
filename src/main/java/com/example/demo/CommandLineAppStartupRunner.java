package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.example.demo.ejemploIoc.ServicioX;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private ServicioX myService;

    public CommandLineAppStartupRunner(ServicioX myService) {
        this.myService = myService;
    }

    @Override
    public void run(String... args) throws Exception {
        myService.metodoX();

    }
}
