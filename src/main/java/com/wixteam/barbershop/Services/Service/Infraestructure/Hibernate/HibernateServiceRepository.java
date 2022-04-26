package com.wixteam.barbershop.Services.Service.Infraestructure.Hibernate;

import com.wixteam.barbershop.Services.Service.Domain.Ports.ServiceRepository;
import com.wixteam.barbershop.Services.Service.Domain.Service;
import com.wixteam.barbershop.Shared.Infraestructure.Hibernate.HibernateRespository;
import com.wixteam.barbershop.Users.User.Domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class HibernateServiceRepository extends HibernateRespository<Service> implements ServiceRepository {
    protected HibernateServiceRepository(@Qualifier("session-factory") SessionFactory sessionFactor) {
        super(sessionFactor, Service.class);
    }

    @Override
    public void save(Service service) {

    }

    @Override
    public List<Service> all() {
        return null;
    }

    @Override
    public void delete(String idService) {

    }

    @Override
    public void update(Service service, String idService) {

    }
}
