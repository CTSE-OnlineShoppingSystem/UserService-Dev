package com.microservice.micro_service_user_management.Repository;

import com.microservice.micro_service_user_management.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>  {
    User findTopByOrderByUserIdDesc();
}
