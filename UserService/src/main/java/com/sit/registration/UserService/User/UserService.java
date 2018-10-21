package com.sit.registration.UserService.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository userRepository;
    
    public List<User> getAll(){
        return userRepository.findAll();
    }

}