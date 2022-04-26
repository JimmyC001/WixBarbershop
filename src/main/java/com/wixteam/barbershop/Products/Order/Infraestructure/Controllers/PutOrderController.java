package com.wixteam.barbershop.Products.Order.Infraestructure.Controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.wixteam.barbershop.Products.Order.Application.Update.OrderUpdate;
import com.wixteam.barbershop.Users.User.Infraestructure.Controllers.PutUserControllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/Orders")
public class PutOrderController {
    @Autowired
    private OrderUpdate update;
    @PutMapping(value = "/Update/{OrderId}")
    public ResponseEntity execute(@PathVariable("OrderId") String id, @RequestBody OrderRequest request){
        update.execute(id,request.getOrderStatus(),request.getOrderDate());
        return ResponseEntity.status(HttpStatus.CREATED).body("Se modifico la orden con id:"+id);
    }

     static class OrderRequest{
        @JsonProperty("OrderStatus")
        private String OrderStatus;
         @JsonProperty("OrderDate")
         private String OrderDate;

         @Override
         public String toString() {
             return "OrderRequest{" +
                     "OrderStatus='" + OrderStatus + '\'' +
                     ", OrderDate='" + OrderDate + '\'' +
                     '}';
         }

         public String getOrderStatus() {
             return OrderStatus;
         }

         public void setOrderStatus(String orderStatus) {
             OrderStatus = orderStatus;
         }

         public String getOrderDate() {
             return OrderDate;
         }

         public void setOrderDate(String orderDate) {
             OrderDate = orderDate;
         }
     }
}
