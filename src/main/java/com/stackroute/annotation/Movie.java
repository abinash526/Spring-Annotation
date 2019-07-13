package com.stackroute.annotation;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

public class Movie /*implements*//* ApplicationContextAware, BeanFactoryAware,*//* BeanNameAware*/ {
    /*public void init()
    {
        System.out.println(nameOfBean+"  initialized");
    }
    public void destroy()
    {
        System.out.println(nameOfBean+" Destroyed Movie ");
    }*/



    Actor actor;
    String nameOfBean;
    private ApplicationContext applicationContext;
    public Movie(){}
    public void show(){
        System.out.println("Its movie time");
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void act()
    {
        actor.act();
    }

    public Movie setActor(Actor actor) {
        this.actor = actor;
        return this;
    }

    public void setBeanName(String s) {
        nameOfBean=s;

    }
//    public void setBeanName(String beanName) {
//        System.out.println("Name of the bean is:-"+beanName);}
//
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("Name of the bean factory is:-"+beanFactory);
//
//    }
//
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext=applicationContext;
//        System.out.println("Container Detail is :-"+applicationContext);
//
//    }
}
