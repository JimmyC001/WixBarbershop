package com.wixteam.barbershop.Products.Order.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Products")
public class PostOrderController {
    @PostMapping(value = "/Order")
    public ResponseEntity execute(@RequestBody OrderRequest request ){
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo la orden " + request.toString());
    }

    static class OrderRequest{

        @JsonProperty("OrdenDate")
        private String OrdenDate;
        @JsonProperty("Product")
        private String Product;
        @JsonProperty("Status")
        private String Status;

        public OrderRequest() {
        }

        @Override
        public String toString() {
            return "OrderRequest{" +
                    "OrdenDate='" + OrdenDate + '\'' +
                    ", Product='" + Product + '\'' +
                    ", Status='" + Status + '\'' +
                    '}';
        }

        public String getOrdenDate() {
            return OrdenDate;
        }

        public void setOrdenDate(String ordenDate) {
            OrdenDate = ordenDate;
        }

        public String getProduct() {
            return Product;
        }

        public void setProduct(String product) {
            Product = product;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }
    }
}
