package com.example.handler;

import com.example.modle.vo.RequestVO;
import com.example.modle.vo.ResponseVO;

/**
 * Created by xueph on 2017/8/31.
 */
public interface IRequestHandler {
    public Class getParamsVOClass();
    public ResponseVO handler(RequestVO requestVO);
}
