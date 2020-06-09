package com.verma.shivam.demo.service;

import com.verma.shivam.demo.Repository.UserRepository;
import com.verma.shivam.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(@Qualifier("userRepositoryMongoImpl") UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User registerUser(User user){
        return userRepository.save(user);
//        return user;
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public  User getUser(String id){
        return userRepository.findUserById(id);
    }
}
