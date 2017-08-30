package com.example.json;

import com.example.modle.vo.RequestVO;
import com.example.modle.vo.User2VO;
import com.example.modle.vo.UserVO;
import com.example.util.json.JsonUtil;
import com.mongodb.util.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Random;

/**
 * Created by xueph on 2017/8/29.
 */
public class JacksonTest {
    Logger logger = Logger.getLogger(this.getClass());
    @Test
    public void jsonToUser() {
        logger.info("start json->object....");
        String json = "{\"userId\":\"xph\", \"name\":\"xueph\"}";
        logger.info("source json:" + json);
        UserVO user = JsonUtil.jsonToObject(json, UserVO.class);

        logger.info("json->object is success.....");

        logger.info("start object->json....");
        String jsonTem1 = JsonUtil.objectToJson(user);
        logger.info("jsonTem:" + jsonTem1);
        logger.info("object->json is success....");


        User2VO user2VO = JsonUtil.jsonToObject(json, User2VO.class);
        user2VO.setRequestId(new Random().nextLong());
        user2VO.setSignature("12321sa12321");
        user2VO.setMethod("modifyUser");

        String jsonTem2 = JsonUtil.objectToJson(user2VO);
        logger.info("user2VO->json:" + jsonTem2);

        RequestVO requestVO = new RequestVO();
        requestVO.setRequestId(new Random().nextLong());
        requestVO.setSignature("12321sa12321");
        requestVO.setMethod("modifyUser");
        requestVO.setParams(jsonTem1);
        String jsonTem3 = JsonUtil.objectToJson(requestVO);
        logger.info("requestVO->json:" + jsonTem3);

        RequestVO requestVO1 = JsonUtil.jsonToObject(jsonTem3, RequestVO.class);
        logger.info("params:" + requestVO1.getParams());

        UserVO userVO = JsonUtil.jsonToObject(requestVO1.getParams(), UserVO.class);
        logger.info("userVO:" + JsonUtil.objectToJson(userVO));

    }
}
