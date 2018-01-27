package ua.com.owu.dao.impl;

import org.springframework.stereotype.Repository;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    EntityManager entityManager;
    public void insert(User user) {
entityManager.persist(user);
    }

    public void insert(String name, int age) {
entityManager.persist(new User(name,age));
    }
}
