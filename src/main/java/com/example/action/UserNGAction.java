package com.example.action;

import com.example.modle.ResultVO;
import com.example.modle.User;
import com.example.services.IUserService;
import com.fasterxml.jackson.annotation.JsonView;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by xueph on 2017/4/24.
 */
@Controller
/*public class UserNGAction extends AbstractJsonpResponseBodyAdvice{
    Logger log = Logger.getLogger(this.getClass());
    public UserNGAction() {
        super("callback");
    }*/
public class  UserNGAction {
    Logger log = Logger.getLogger(this.getClass());
    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @RequestMapping("/loginJson1")
    //@JsonView
    @ResponseBody
    public ResultVO loginJson(@RequestBody User user) {

        String userId = user.getUserId();

        String password = user.getPassword();
        log.trace("entry 1");
        log.info("entry 2");
        log.info("entry 3");
        log.info("userId:" + userId);
        log.info("password:" + password);
        long ret = 0;
        //String userId = "";
        //String password = "";
        try {
            ret = userService.logon(userId, password);
        } catch (Exception e) {
            ret = -100;
            e.printStackTrace();
        }

        String message = "登录失败！";
        User userDB = null;
        if(ret > 0) {
            userDB = userService.getUser(userId);
            //modelMap.put("currUser", user);
            message = "登录成功！";
        } else if(ret == -1000) {
            message = "用户不存在！";
        } else if (ret == -100) {
            message = "操作异常！";
        } else if (ret == -1) {
            message = "未知异常！";
        }
        log.info("message:" + message);
        ResultVO resultVO = new ResultVO();
        resultVO.setRetNum(ret);
        resultVO.setRetMsg(message);
        return resultVO;
    }

    @RequestMapping("/login")
    @JsonView
    @ResponseBody
    public String login(@RequestBody User user) {

        ResultVO resultVO  = this.loginJson(user);
        return resultVO.getRetMsg();
    }
}
