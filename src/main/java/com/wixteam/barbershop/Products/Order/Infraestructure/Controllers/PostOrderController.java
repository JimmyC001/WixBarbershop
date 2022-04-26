package com.wixteam.barbershop.Products.Order.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Products.Order.Application.Create.OrderCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Products")
public class PostOrderController {

    @Autowired
    private OrderCreator creator;

    @PostMapping(value = "/Order")
    public ResponseEntity execute(@RequestBody OrderRequest request ){
        creator.execute(request.getIdOrder(),request.getStatus(),request.getOrdenDate());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se creo la orden " + request.toString());
    }

    static class OrderRequest{

        @JsonProperty("OrdenDate")
        private String OrdenDate;
        @JsonProperty("idOrder")
        private String idOrder;
        @JsonProperty("Status")
        private String Status;

        public OrderRequest() {
        }

        @Override
        public String toString() {
            return "OrderRequest{" +
                    "OrdenDate='" + OrdenDate + '\'' +
                    ", idOrder='" + idOrder + '\'' +
                    ", Status='" + Status + '\'' +
                    '}';
        }

        public String getOrdenDate() {
            return OrdenDate;
        }

        public void setOrdenDate(String ordenDate) {
            OrdenDate = ordenDate;
        }

        public String getIdOrder() {
            return idOrder;
        }

        public void setIdOrder(String idOrder) {
            this.idOrder = idOrder;
        }

        public String getStatus() {
            return Status;
        }

        public void setStatus(String status) {
            Status = status;
        }
    }
}
