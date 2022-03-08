package com.javaProject.hibernateAndJpa.restApi;

import com.javaProject.hibernateAndJpa.Business.IUserService;
import com.javaProject.hibernateAndJpa.Entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController extends BaseController{
    private IUserService userService;

    @Autowired
    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> get(){
        return userService.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id){
        return userService.getById(id);
    }

    @PostMapping("/users/add")
    public void add(@RequestBody User user){
        userService.add(user);
    }

    @PostMapping("/users/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @PostMapping("/users/delete")
    public void delete(@RequestBody User user){
        userService.delete(user);
    }
}
