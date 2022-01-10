package com.gec.spring5demo3.service.impl;

import com.gec.spring5demo3.entity.Persion;
import com.gec.spring5demo3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "UserServiceImpl")
public class UserServiceImpl implements UserService {

//    @Autowired
//    @Qualifier(value = "Persion2")
    @Resource(name = "Persion2")
    private Persion persion;

    @Override
    public void test() {
        System.out.println("test-servcie");
    }

    @Override
    public void test2() {
        System.out.println(persion);
    }
}
