package com.wixteam.barbershop.Users.User.Infraestructure.Hibernate;


import com.wixteam.barbershop.Shared.Domain.Aggregate.CustomUUID;
import com.wixteam.barbershop.Shared.Infraestructure.Hibernate.HibernateRespository;
import com.wixteam.barbershop.Users.User.Domain.Ports.UserRepository;
import com.wixteam.barbershop.Users.User.Domain.User;
import com.wixteam.barbershop.Users.User.Domain.ValueObjects.UserId;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional("transactional-manager")
public class HibernateUserRepository extends HibernateRespository<User> implements UserRepository {
    protected HibernateUserRepository(@Qualifier("session-factory") SessionFactory sessionFactory) {
        super(sessionFactory, User.class);
    }

    @Override
    public void save(User user) {
        persist(user);

    }

    @Override
    public List<User> all() {
        return getAll().get();
    }

    @Override
    public List<User> allCustomer(String customer) {
        return null;
    }

    @Override
    public List<User> allBarber(String Barber) {
        return null;
    }

    @Override
    public void delete(String idUser) {
        User user = byId( new UserId(idUser)).get();
        deleteEntity(user);
    }

    @Override
    public void update(User user, String idUser) {
        User use1 = byId(new UserId(idUser)).get();

    }

}
