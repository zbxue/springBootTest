package com.example.action;

import com.example.dao.UserRepository;
import com.example.modle.User;
import com.example.services.IUserService;
import com.example.services.impl.UserServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xueph on 2017/3/8.
 */
@Controller
@SessionAttributes("currUser")
public class UserAction {
    Logger log = Logger.getLogger(this.getClass());
    @Autowired
    @Qualifier("userService")
    private IUserService userService;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/logon")
    @ResponseBody
    public String logon(//@SessionAttribute User user,
                        @RequestParam("userId") String userId,
                        @RequestParam String password,
                        ModelMap modelMap) {
        log.trace("entry 1");
        log.info("entry 2");
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
        if(ret > 0) {
            User user = new User();
            user.setUserId("");
            modelMap.put("currUser", user);
            message = "登录成功！";
        } else if(ret == -1000) {
            message = "用户不存在！";
        } else if (ret == -100) {
            message = "操作异常！";
        } else if (ret == -1) {
            message = "未知异常！";
        }
        return message;
    }

    @RequestMapping("addUserForward")
    public String addUserForward() {
        return "/user/addUser";
    }

    @RequestMapping("/addUser")
    @ResponseBody
    public User addUser(@RequestParam("userId") String userId,
                        @RequestParam("userName") String userName,
                        @ModelAttribute("user") User user) {
        log.info("userId:" + userId);
        log.info("userName:" + userName);
        log.info("userId:" + user.getUserId());
        log.info("userName:" + user.getUserName());
        log.info("password:" + user.getPassword());

        /*User user1 = new User();
        user.setUserId(userId);
        user.setUserName(userName);*/
        return userRepository.save(user);
    }

    @RequestMapping("/getUserList")
    @ResponseBody
    public List<User> getUserList(@RequestParam("userName") String userName) {
        log.info("entry getUserList");
        List<User> userList = userRepository.findByUserName(userName);
        return userList;
    }
}
