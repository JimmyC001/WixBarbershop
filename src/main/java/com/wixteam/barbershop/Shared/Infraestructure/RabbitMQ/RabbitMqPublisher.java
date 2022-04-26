package com.wixteam.barbershop.Shared.Infraestructure.RabbitMQ;

import com.wixteam.barbershop.Shared.Domain.BusEvent.DomainEvent;
import com.wixteam.barbershop.Shared.Infraestructure.RabbitMQ.Serializable.DomainEventJsonSerializable;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

public class RabbitMqPublisher {

    private final RabbitTemplate rabbitTemplate;

    public  RabbitMqPublisher(RabbitTemplate rabbitTemplate){
        this.rabbitTemplate = rabbitTemplate;
    }

    public void publish(DomainEvent domainEvent, String exchangeName){
        String serializedDomain = DomainEventJsonSerializable.serializable(domainEvent);
        Message message = new Message(
                serializedDomain.getBytes(),
                MessagePropertiesBuilder.newInstance()
                        .setContentEncoding("utf-8")
                        .setContentType("application/Json").build()
        );
        rabbitTemplate.send(exchangeName,domainEvent.eventname(), message);
    }
}
