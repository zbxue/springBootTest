package com.example.services;

import com.example.modle.User;

/**
 * Created by xueph on 2017/3/8.
 */
public interface IUserService {
    public long logon(String userId, String password);
    public long logon1(String userId, String password);
    public User getUser(String userId);
}
