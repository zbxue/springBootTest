package com.example.dao;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;


import java.io.Serializable;

/**
 * Created by xueph on 2017/3/10.
 */
@NoRepositoryBean
public interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
    /**
     * 根据ID查找
     * @param id
     * @return
     */
    T findOne(ID id);

    /**
     * 保存属性
     * @param entity
     * @return
     */
    T save(T entity);
}
