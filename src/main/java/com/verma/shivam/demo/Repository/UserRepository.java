package com.verma.shivam.demo.Repository;

import com.verma.shivam.demo.model.User;

import java.util.List;

public interface UserRepository {

    User save(User user);
    List<User> findAll();
    User findUserById(String id);
}
