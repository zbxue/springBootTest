package com.example.modle.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by xueph on 2017/8/30.
 */
public class RequestVO {
    @Getter @Setter private Long requestId;
    @Getter @Setter private String signature;
    @Getter @Setter private String method;
    @Getter @Setter private String params;
    @JsonIgnore
    @Getter @Setter private BaseVO paramsVO;
}
