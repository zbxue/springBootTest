package com.example.services.impl;

import com.example.dao.ITestRepository;
import com.example.dao.IUserDao;
import com.example.modle.User;
import com.example.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by xueph on 2017/3/8.
 */
@Service("userService")
//@EnableAutoConfiguration
//@Component("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    @Qualifier("userDao")
    private IUserDao userDao;

    @Autowired
    private ITestRepository test;

    @Override
    public long logon(String userId, String password) {
        User user = userDao.getUser(userId);
        if(user == null) {
            return -1000;
        }
        if(password.equals(user.getPassword())) {
            return new Random().nextLong();
        }
        return -1;
    }

    @Override
    public long logon1(String userId, String password) {
        User user = test.getByUserId(userId);
        if(user == null) {
            return -1000;
        }
        if(password.equals(user.getPassword())) {
            return new Random().nextLong();
        }
        return -1;
    }

    @Override
    public User getUser(String userId) {
        User user = null;
        if("1234".equals(userId)) {
            user = new User();
            user.setUserId(userId);
            user.setUserName("张三丰");
        }
        return user;
    }
}
