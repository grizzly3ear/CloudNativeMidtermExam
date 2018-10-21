package com.sit.registration.UserService.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public long getYear(long studentId) {
        return userRepository.getOne(studentId).getYear();
    }

    public User login(User user) {
        User userAuthen = userRepository.getOne(user.getId());
        if (attempt(user)) {
            return userAuthen;
        }

        return null;
    }

    public boolean attempt(User user) {
        String databasePassword = userRepository.getOne(user.getId()).getPassword();
        String password = user.getPassword();
        return databasePassword.equals(password);
    }
}