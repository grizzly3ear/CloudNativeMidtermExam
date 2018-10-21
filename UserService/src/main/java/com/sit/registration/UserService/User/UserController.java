package com.sit.registration.UserService.User;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*", maxAge=3600)
public class UserController {

    @Autowired
    private UserService userService;
    
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser(){
        return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/user/{studentId}/year")
    public ResponseEntity<Long> getYearFromSpecificStudent(@PathVariable long studentId){
        return new ResponseEntity<>(userService.getYear(studentId), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<User> authentication(@RequestBody User user){
        return new ResponseEntity<>(userService.login(user), HttpStatus.OK);
    }
    

}