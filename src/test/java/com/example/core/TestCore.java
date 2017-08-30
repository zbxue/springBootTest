package com.example.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.ResolvableType;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by xueph on 2017/8/15.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCore {
    Map<Integer, List<String>> myMap;
    @Test
    public void testResolvableType() {
        try {
            ResolvableType resolvableType = ResolvableType.forField(getClass().getDeclaredField("myMap"));

            resolvableType.getSuperType();
            resolvableType.asMap();
            resolvableType.getGeneric(0).resolve();
            resolvableType.getGeneric(1).resolve();
            resolvableType.getGeneric(1);
            resolvableType.resolveGeneric(1, 0);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
