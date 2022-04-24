package com.wixteam.barbershop.Products.Product.Infraestructure.Controllers;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Products")
public class PostProductController {
    @PostMapping()
    public ResponseEntity<String> execute3(@RequestBody ProductRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo el Producto " + request.toString());
    }

    static class ProductRequest {
        @JsonProperty("name")
        private String name ;
        @JsonProperty("price")
        private String price;
        @JsonProperty("amount")
        private String amount ;

        public  ProductRequest (){
        }

        @Override
        public String toString() {
            return "BarbarRequest{" +
                    "name='" + name + '\'' +
                    ", price='" + price + '\'' +
                    ", amount='" + amount + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }
    }

}
