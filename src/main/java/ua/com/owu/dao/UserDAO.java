package ua.com.owu.dao;

import ua.com.owu.entity.User;

public interface UserDAO {
    void insert(User user);
    void insert(String name, int age);
}
