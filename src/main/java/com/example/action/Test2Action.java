package com.example.action;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.stereotype.Controller;

/**
 * Created by xueph on 2017/2/17.
 */
@Controller
public class Test2Action {
    String test2() {
        return "test2";
    }
}
