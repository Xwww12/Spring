package com.xw.service;

import com.xw.spring.*;

@Component("userService")
@Scope("prototype")
public class UserService implements BeanNameAware, InitializingBean, UserInterface {

    @Autowired
    private OrderService orderService;

    public String beanName;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("初始化");
    }

    @Override
    public void test() {

    }
}
