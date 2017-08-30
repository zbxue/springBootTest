package com.example.modle;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.Size;

/**
 * Created by xueph on 2017/3/8.
 */
public class User {
    @Id
    private String id;
    //@NotBlank
    //@Size(min = 5, max = 16, message = "备注：长度必须在5-16之间")
    private String userId;
    //@NotEmpty
    private String userName;
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        System.out.println("setUserName:" +  userName);
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User[id="+id+",userId="+userId +",userName="+userName+"]";
    }
}
