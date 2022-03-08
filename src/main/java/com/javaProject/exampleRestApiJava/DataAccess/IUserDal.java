package com.javaProject.exampleRestApiJava.DataAccess;
import com.javaProject.exampleRestApiJava.Entities.User;
import java.util.List;

public interface IUserDal {
    List<User> getAll();
    User getById(int id);
    void add(User user);
    void update(User user);
    void delete(User user);
}
