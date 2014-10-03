package com.imipgroup.hieuvt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hieuvt on 9/29/2014.
 */
public class HelloSpring {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
//        System.out.println(obj.getMessage());
//        obj.setMessage("Edited message");
//        System.out.println(obj.getMessage());

        HelloWorldCaller helloWorldCaller = (HelloWorldCaller) context.getBean("helloWorldCaller");
        System.out.println(helloWorldCaller.getHelloWorld().getMessage());
    }
}
