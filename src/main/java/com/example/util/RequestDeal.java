package com.example.util;

import com.example.handler.IRequestHandler;
import com.example.handler.SaveUserRequestHandler;
import com.example.modle.vo.RequestVO;
import com.example.modle.vo.ResponseVO;
import com.example.modle.vo.UserVO;
import com.example.util.json.JsonUtil;
import org.apache.log4j.Logger;

/**
 * Created by xueph on 2017/8/31.
 */
public class RequestDeal {
    Logger logger = Logger.getLogger(this.getClass());
    public String deal(String json) {
        RequestVO requestVO = JsonUtil.jsonToObject(json, RequestVO.class);
        logger.info("params:" + requestVO.getParams());
        //验签

        //解密

        //处理请求
        IRequestHandler requestHandler = getRequestHandler(requestVO.getMethod());
        UserVO userVO = JsonUtil.jsonToObject(requestVO.getParams(), UserVO.class);
        logger.info("userVO:" + JsonUtil.objectToJson(userVO));
        requestVO.setParamsVO(userVO);
        ResponseVO responseVO = requestHandler.handler(requestVO);
        responseVO.setResult(JsonUtil.objectToJson(responseVO.getResultVO()));

        //对result加密

        //签名result签名

        //返回结果

        return JsonUtil.objectToJson(responseVO);
    }

    public IRequestHandler getRequestHandler(String method) {
        return new SaveUserRequestHandler();
    }
}
