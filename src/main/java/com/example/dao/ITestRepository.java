package com.example.dao;

import com.example.modle.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xueph on 2017/3/9.
 */
public interface ITestRepository extends MyBaseRepository<User, Long> {
    public User getByUserId(String userId);
}
