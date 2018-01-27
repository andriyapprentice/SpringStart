package ua.com.owu.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import javax.transaction.Transactional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO dao;

    @Transactional
    public void insert(User user) {
        dao.insert(user);
    }

    @Transactional
    public void insert(String name, int age) {
        dao.insert(new User(name, age));
    }
}
