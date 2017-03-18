package com.dubbo.demo.serviceImpl;

import com.dubbo.demo.servicei.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



/**
 * Created by nickzhang on 2017/3/14.
 */
@Service
public class UserServiceImpl implements UserService{

    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    public String sayHello() {
        logger.info("接口被远程调用！");
        return "Hello Dubbo";
    }
}
