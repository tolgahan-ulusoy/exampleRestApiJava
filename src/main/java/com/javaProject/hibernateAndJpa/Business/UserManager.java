package com.javaProject.hibernateAndJpa.Business;

import com.javaProject.hibernateAndJpa.DataAccess.IUserDal;
import com.javaProject.hibernateAndJpa.Entities.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserManager implements IUserService{

    private IUserDal userDal;

    @Autowired
    public UserManager(IUserDal userDal) {
        this.userDal = userDal;
    }

    @Override
    @Transactional
    public List<User> getAll() {
        return this.userDal.getAll();
    }

    @Override
    public User getById(int id){ return this.userDal.getById(id); }

    @Override
    @Transactional
    public void add(User user) {
        this.userDal.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        this.userDal.update(user);
    }

    @Override
    @Transactional
    public void delete(User user) {
        this.userDal.delete(user);
    }
}
