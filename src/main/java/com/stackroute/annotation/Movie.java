package com.stackroute.annotation;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    @PostConstruct
    public void init()
    {
        System.out.println(nameOfBean+"  initialized---------------");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println(nameOfBean+" Destroyed  ------------");
    }



    @Autowired
    Actor actor;
    @Value("${movie.name}")
    String nameOfBean;
    private ApplicationContext applicationContext;
    public Movie(){}
    public void show(){

        System.out.println("Its movie time");
        actor.act();
    }

//    public Movie(Actor actor) {
//        this.actor = actor;
//    }
//
//    public void act()
//    {
//        actor.act();
//    }
//
//    public Movie setActor(Actor actor) {
//        this.actor = actor;
//        return this;
//    }
//
//    public void setBeanName(String s) {
//        nameOfBean=s;
//
//    }
    public void setBeanName(String beanName) {
        System.out.println("Name of the bean is:-"+beanName);}

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Name of the bean factory is:-"+beanFactory);

    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("Container Detail is :-"+applicationContext);

    }
}
