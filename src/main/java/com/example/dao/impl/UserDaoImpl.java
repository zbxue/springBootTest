package com.example.dao.impl;

import com.example.dao.IUserDao;
import com.example.modle.User;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.stereotype.Repository;

/**
 * Created by xueph on 2017/3/8.
 */
@Repository("userDao")
public class UserDaoImpl implements IUserDao {
    @Override
    public User getUser(String userId) {
        User user = null;
        if ("admin".equals(userId)) {
            user = new User();
            user.setUserId("admin");
            user.setPassword("111111");
            user.setUserName("超级管理员");
        }

        return user;
    }
}
