package com.wixteam.barbershop.Services.Date.Infraestructure.Hibernate;

import com.wixteam.barbershop.Services.Date.Domain.Date;
import com.wixteam.barbershop.Services.Date.Domain.Port.DateRepository;
import com.wixteam.barbershop.Shared.Infraestructure.Hibernate.HibernateRespository;
import com.wixteam.barbershop.Users.User.Domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional("transactional-manager")
public class HibernateDateRepository extends HibernateRespository<Date> implements DateRepository {
    protected HibernateDateRepository(@Qualifier("session-factory") SessionFactory sessionFactory) {
        super(sessionFactory, Date.class);
    }

    @Override
    public void save(Date date) {
        persist(date);
    }

    @Override
    public List<Date> all() {
        return null;
    }

    @Override
    public void delete(String idDate) {

    }
}
