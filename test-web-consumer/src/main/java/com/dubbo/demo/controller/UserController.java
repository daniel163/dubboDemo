package com.dubbo.demo.controller;

import com.dubbo.demo.servicei.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by nickzhang on 2017/3/14.
 */
@Controller
@RequestMapping("/controller")
public class UserController {

    @Resource(name="userService")
    private UserService userService;


    @ResponseBody
    @RequestMapping("/hello")
    public String sayHello(){
        return userService.sayHello();
    }
}
