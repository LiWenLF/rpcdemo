package com.faisco.service.impl;

import com.faisco.annotation.RpcService;
import com.faisco.service.HelloService;

/**
 * Created by admin on 2018/3/21.
 */
@RpcService(HelloService.class) // 指定远程接口
public class HelloServiceImpl implements HelloService{

    public String hello(String name) {
        return null;
    }
}
