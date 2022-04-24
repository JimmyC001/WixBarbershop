package com.wixteam.barbershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BarberShopApplication {

    public static void main(String[] args) {
        SpringApplication sApp = new SpringApplication(BarberShopApplication.class);
        sApp.run(args);
    }

}
