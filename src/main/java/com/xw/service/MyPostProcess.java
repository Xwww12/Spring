package com.xw.service;

import com.xw.spring.BeanPostProcessor;
import com.xw.spring.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Component
public class MyPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(String beanName, Object bean) {
        if (beanName.equals("userService")) {
            System.out.println("111111111");
        }

        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(String beanName, Object bean) {
        if (beanName.equals("userService")) {
            Object proxyInstance = Proxy.newProxyInstance(MyPostProcess.class.getClassLoader(),
                    bean.getClass().getInterfaces(),
                    new InvocationHandler() {
                        @Override
                        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                            System.out.println("切面逻辑");
                            return method.invoke(bean, args);
                        }
                    });
            return proxyInstance;
        }
        return bean;
    }
}
