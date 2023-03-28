package com.xw.spring;

public class BeanDefinition {
    // bean的类型
    private Class type;
    // bean是单例还是多例
    private String scope;

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
