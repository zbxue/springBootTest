package com.example.util.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * Created by xueph on 2017/8/29.
 */
public class JsonUtil {
    public static  <T> T jsonToObject(String json, Class<T> classType) {
        ObjectMapper mapper = new ObjectMapper();
        T t = null;
        try {
           t = mapper.readValue(json, classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return t;
    }


    public static String objectToJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
