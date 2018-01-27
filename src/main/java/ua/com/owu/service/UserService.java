package ua.com.owu.service;

import ua.com.owu.entity.User;

public interface UserService {
    void insert(User user);
    void insert(String name, int age);
}
