package com.wixteam.barbershop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.sql.*;


@SpringBootApplication
public class BarberShopApplication {

    public static void main(String[] args) throws SQLException {
        SpringApplication sApp = new SpringApplication(BarberShopApplication.class);
        sApp.run(args);


        System.out.printf("hello");
        Connection connection=null;
        connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/prueba?user=root&password=12345");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);
        ResultSet rs = statement.executeQuery("select* from author");

        while (rs.next()){
            System.out.println("Autor: "+ rs.getString("namee" ) + "   Apellido: " + rs.getString("last_name") );
        }
       // System.out.println("nombre" + rs.getString("namee"));
    }

}
