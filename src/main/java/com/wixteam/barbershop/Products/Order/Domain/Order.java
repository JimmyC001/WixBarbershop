package com.wixteam.barbershop.Products.Order.Domain;

import com.wixteam.barbershop.Products.Order.Domain.ValueObjects.OrderDate;
import com.wixteam.barbershop.Products.Order.Domain.ValueObjects.OrderId;
import com.wixteam.barbershop.Products.Order.Domain.ValueObjects.OrderStatus;
import com.wixteam.barbershop.Products.Order.Domain.ValueObjects.OrderValue;
import com.wixteam.barbershop.Products.Product.Domain.Product;

import java.util.HashMap;

public class Order {
    private OrderId orderId;
    private OrderValue orderValue;
    private OrderStatus orderStatus;
    private OrderDate orderDate;
    private Product product;

    public Order(OrderId orderId, OrderValue orderValue, OrderStatus orderStatus, OrderDate orderDate, Product product) {
        this.orderId = orderId;
        this.orderValue = orderValue;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.product = product;
    }

    public static Order create(OrderId orderId, OrderValue orderValue, OrderStatus orderStatus, OrderDate orderDate, Product product){
        Order order = new Order(orderId,orderValue,orderStatus,orderDate,product);
        return order;
    }

    public HashMap<String,Object> data(){
        HashMap<String,Object> data = new HashMap<>(){
            {
                put("Id:",orderId.value());
                put("Value",orderValue.value());
                put("status",orderStatus.value());
                put("date",orderDate.value());
            }

        };
        return data;
    }
}
