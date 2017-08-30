package com.example.util;

import com.example.modle.vo.BaseVO;

import java.lang.reflect.Field;
import java.util.Map;

/**
 * Created by xueph on 2017/8/30.
 */
public class MapUtil {
    public static Map objectToMap(Object object) {
        if (object == null) {
            return null;
        }
        if(!(object instanceof BaseVO)) {
            return null;
        }

        Field[] fields = object.getClass().getDeclaredFields();
        Map map = null;
        for(Field field : fields) {

        }
        return map;
    }
}
