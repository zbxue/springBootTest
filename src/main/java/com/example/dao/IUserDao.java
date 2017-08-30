package com.example.dao;

import com.example.modle.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xueph on 2017/3/8.
 */
public interface IUserDao {
    public User getUser(String userId);
}
