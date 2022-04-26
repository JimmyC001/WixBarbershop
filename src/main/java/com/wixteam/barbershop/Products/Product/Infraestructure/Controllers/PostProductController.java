package com.wixteam.barbershop.Products.Product.Infraestructure.Controllers;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Products.Product.Application.Create.ProductCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.sql.*;

@RestController
@RequestMapping(value = "/Product")
public class PostProductController {
    @Autowired
    private ProductCreator create;
    @PostMapping(value = "/Create")
    public ResponseEntity<String> execute(@RequestBody ProductRequest request ){
        create.execute(request.getId(),request.getDescription(),request.getPrice(),request.getRating(),request.getQuantity());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el Producto " + request.toString());
    }

    static class ProductRequest {
        @JsonProperty("id")
        private String id;
        @JsonProperty("description")
        private String description;
        @JsonProperty("price")
        private double price;
        @JsonProperty("quantity")
        private int quantity;
        @JsonProperty("rating")
        private int rating;

        public String getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public double getPrice() {
            return price;
        }

        public int getQuantity() {
            return quantity;
        }

        public int getRating() {
            return rating;
        }

        @Override
        public String toString() {
            return "ProductRequest{" +
                    "id='" + id + '\'' +
                    ", description='" + description + '\'' +
                    ", price=" + price +
                    ", quantity=" + quantity +
                    ", rating=" + rating +
                    '}';
        }
    }

}
