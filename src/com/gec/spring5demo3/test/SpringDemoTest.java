package com.gec.spring5demo3.test;

import com.gec.spring5demo3.entity.User;
import com.gec.spring5demo3.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoTest {

    @Test
    public void test(){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("application.xml");

        User user = (User) applicationContext.getBean("User");
        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        System.out.println(user);
        userService.test();
    }

    @Test
    public void test2(){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("application.xml");

        UserService userService = (UserService) applicationContext.getBean("UserServiceImpl");
        userService.test2();
    }
}
