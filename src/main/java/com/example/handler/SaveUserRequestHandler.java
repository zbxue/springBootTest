package com.example.handler;

import com.example.modle.vo.BaseVO;
import com.example.modle.vo.RequestVO;
import com.example.modle.vo.ResponseVO;
import com.example.modle.vo.UserVO;

/**
 * Created by xueph on 2017/8/31.
 */
public class SaveUserRequestHandler implements IRequestHandler {
    @Override
    public Class getParamsVOClass() {
        return UserVO.class;
    }

    @Override
    public ResponseVO handler(RequestVO requestVO) {
        UserVO userVO = (UserVO) requestVO.getParamsVO();


        return null;
    }
}
