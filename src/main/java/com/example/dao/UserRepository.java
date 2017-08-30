package com.example.dao;

import com.example.modle.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by xueph on 2017/3/31.
 */
public interface UserRepository extends MongoRepository<User, String>{
    public User findByUserId(String userId);
    public List<User> findByUserName(String name);
}
