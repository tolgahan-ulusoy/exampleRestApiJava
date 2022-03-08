package com.javaProject.exampleRestApiJava.Business;

import com.javaProject.exampleRestApiJava.Entities.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    User getById(int id);
    void add(User user);
    void update(User user);
    void delete(User user);
}
