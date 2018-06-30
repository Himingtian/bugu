package com.bugu.user.controller;

import com.bugu.user.entity.User;
import com.bugu.user.service.RegisterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhoumingtian on 2018-06-22
 */
@Controller
@RequestMapping("/user")
public class RegisterController {

    private static final Logger logger = LogManager.getLogger(RegisterController.class);

    @Autowired
    private RegisterService registerServiceImpl;

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ResponseEntity<?> register(){
        logger.info("进入接口 >>> register 用户名: [{}] . 密码 [{}]");
        User user = new User();
        user.setUserName("张三");
        user.setPassword("lisi");
        ResponseEntity<Object> responseEntity = new ResponseEntity<>(user, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/sendSMSMessage")
    public ResponseEntity<?> sendSMSMessage(){
        logger.info("进入获取短信验证码接口");
        String[] mobiles = {"15018714832"};
        for (String mobile : mobiles) {
           registerServiceImpl.sendSMSMessage(mobile);
        }

        return new ResponseEntity<Object>("成功发送", HttpStatus.OK);
    }
}
