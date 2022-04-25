package com.wixteam.barbershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


import java.sql.*;


@SpringBootApplication
@ImportResource("classpath:dependencies.xml")
public class BarberShopApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication sApp = new SpringApplication(BarberShopApplication.class);
        sApp.run(args);



    }

}
