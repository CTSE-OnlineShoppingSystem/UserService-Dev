package com.microservice.micro_service_user_management.Service;

import com.microservice.micro_service_user_management.Model.User;
import com.microservice.micro_service_user_management.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //add users
    public void addUser(User user){
        userRepository.save(user);
    }

    //get User
    public Object getUser(String id){
        return userRepository.findById(id);
    }

    /* new commit to check */
}