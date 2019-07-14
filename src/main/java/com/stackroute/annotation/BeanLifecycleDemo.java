package com.stackroute.annotation;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemo implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("-------Bean is going to destroy----------");

    }
    @PostConstruct
    public void init(){
        System.out.println("Initializing inside cutom init method");
    }
    @PreDestroy
    public void Customdestroy()
    {
        System.out.println("Destroying inside custom destroy method");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("---Bean Initializing---");

    }
}
