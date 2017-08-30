package com.example;

import com.example.modle.vo.BaseVO;
import com.example.modle.vo.UserVO;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Created by xueph on 2017/8/31.
 */
public class TestParentVSChild {
    Logger log = Logger.getLogger(this.getClass());
    @Test
    public void testToPType() {
        UserVO userVO = new UserVO();
        userVO.setUserId("abc");
        userVO.setName("爱因斯坦");
        userVO.setId("NO1");
        toParent(userVO);
    }

    public void toParent(BaseVO baseVO) {
        log.info("name:" + baseVO.getClass().getName());
        log.info("getSimpleName:" + baseVO.getClass().getSimpleName());
        log.info("getTypeName:" + baseVO.getClass().getTypeName());
        log.info("getCanonicalName:" + baseVO.getClass().getCanonicalName());
        log.info("getSigners:" + baseVO.getClass().getSigners());


        log.info("getSimpleName:" + baseVO.getClass().getSuperclass().getSimpleName());
        log.info("getTypeName:" + baseVO.getClass().getSuperclass().getTypeName());


    }
}
