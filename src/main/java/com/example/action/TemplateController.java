package com.example.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by xueph on 2017/4/1.
 */
@Controller
public class TemplateController {
    @RequestMapping("/helloHtml")
    public String helloHtml(Map<String, Object> map) {
        map.put("hello", "from TemplateController.helloHtml.");
        return "/helloHtml";
    }
}
