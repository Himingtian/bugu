package com.bugu.user.controller;

import com.bugu.user.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    @RequestMapping(method = RequestMethod.GET, value = "/register")
    public ResponseEntity<?> register(){
        logger.info("进入接口 >>> register 用户名: [{}] . 密码 [{}]");
        User user = new User();
        user.setUserName("张三");
        user.setPassword("lisi");
        ResponseEntity<Object> responseEntity = new ResponseEntity<>(user, HttpStatus.OK);
        return responseEntity;
    }
}
