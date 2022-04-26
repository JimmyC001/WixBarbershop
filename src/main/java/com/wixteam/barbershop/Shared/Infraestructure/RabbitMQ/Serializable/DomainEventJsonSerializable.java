package com.wixteam.barbershop.Shared.Infraestructure.RabbitMQ.Serializable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wixteam.barbershop.Shared.Domain.BusEvent.DomainEvent;
import org.hibernate.type.StringNVarcharType;
import org.springframework.validation.ObjectError;

import java.io.Serializable;
import java.util.HashMap;

public class DomainEventJsonSerializable {

    public static String serializable(DomainEvent domainEvent) {
        HashMap<String, Serializable> attribute = domainEvent.toPrimitive();
        attribute.put("id", domainEvent.aggregateId());

        HashMap<String, Serializable> message = new HashMap<>();

        message.put("data", new HashMap<String, Serializable>() {{
            put("id", domainEvent.eventId());
            put("type", domainEvent.eventname());
            put("occurred_on", domainEvent.occurredOn());
            put("attributte", attribute);
        }});

        message.put("meta", new HashMap<String, Serializable>());
        return jsonEncode(message);
    }

    public static String jsonEncode(HashMap<String, Serializable> map) {
        try {
            return new ObjectMapper().writeValueAsString(map);
        } catch (Exception e) {
            return " ";
        }
    }
}
