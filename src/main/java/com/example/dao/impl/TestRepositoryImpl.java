package com.example.dao.impl;

import com.example.dao.ITestRepository;
import com.example.modle.User;

/**
 * Created by xueph on 2017/3/10.
 */
public class TestRepositoryImpl implements ITestRepository{
    @Override
    public User getByUserId(String userId) {
        return null;
    }

    /**
     * 根据ID查找
     *
     * @param aLong
     * @return
     */
    @Override
    public User findOne(Long aLong) {
        return null;
    }

    /**
     * 保存属性
     *
     * @param entity
     * @return
     */
    @Override
    public User save(User entity) {
        return null;
    }
}
