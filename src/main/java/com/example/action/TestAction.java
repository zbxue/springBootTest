package com.example.action;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xueph on 2017/2/17.
 */
@Controller
public class TestAction {
    @RequestMapping("/test1")
    @ResponseBody
    String test1() {
        return "test1";
    }

    @RequestMapping("/test12")
    String test12() {
        return "/test";
    }
}
