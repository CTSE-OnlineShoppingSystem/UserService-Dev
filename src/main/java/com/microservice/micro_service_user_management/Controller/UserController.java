package com.microservice.micro_service_user_management.Controller;

import com.microservice.micro_service_user_management.Model.User;
import com.microservice.micro_service_user_management.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/ShoppingSite")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/addusers")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping("/addusers")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/login/{userId}")
    public Optional<User> getUserByIdForLogin(@PathVariable String userId) {
        return userRepository.findById(userId);

    }
    @DeleteMapping("/delete/{userId}")
    public void deleteUsers(@PathVariable String userId) {
         userRepository.deleteById(userId);

    }

}
