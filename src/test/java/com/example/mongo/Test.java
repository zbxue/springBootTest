package com.example.mongo;

import com.mongodb.DB;
import com.mongodb.Mongo;

import java.util.Set;

/**
 * Created by xueph on 2017/3/31.
 */
public class Test {
    @org.junit.Test
    public void testMongodb() {
        try{
            //连接mongodb服务
            Mongo mongo = new Mongo("127.0.0.1", 27017);
            //根据mongodb数据库的名称获取mongodb对象
            DB db = mongo.getDB("mydb");
            Set<String> collectionNames = db.getCollectionNames();
            //打印mydb中的集合
            collectionNames.forEach(name ->{
                System.out.println("collectionNames:" + name);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
