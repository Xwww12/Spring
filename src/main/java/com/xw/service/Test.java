package com.xw.service;

import com.xw.spring.MyApplicationContext;

public class Test {
    public static void main(String[] args) {
        MyApplicationContext myApplicationContext = new MyApplicationContext(AppConfig.class);
        UserInterface userService = (UserInterface) myApplicationContext.getBean("userService");
        userService.test();
    }
}
