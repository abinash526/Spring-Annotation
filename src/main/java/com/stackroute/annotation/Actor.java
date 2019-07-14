package com.stackroute.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Actor {

    @Value("${actor.name}")
    private String name;

    @Value("${actor.gender}")
    private String gender;

    @Value("${actor.age}")
    private int age;
    public Actor(){}




    public void act()
    {
        System.out.println(this.name+" is acting");
    }


}
