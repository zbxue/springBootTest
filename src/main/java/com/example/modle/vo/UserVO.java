package com.example.modle.vo;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xueph on 2017/8/30.
 */
@JsonPropertyOrder(alphabetic = true)
public class UserVO extends BaseVO{
    @Getter @Setter private String abc;
    @Getter @Setter private String bac;

    private String userId;
    private String name;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
