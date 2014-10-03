package com.imipgroup.hieuvt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hieuvt on 10/3/2014.
 */
public class HelloSpringConfig {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        HelloWorldCaller helloWorldCaller = (HelloWorldCaller) context.getBean("helloWorldCaller");
        System.out.println(helloWorldCaller.getHelloWorld().getMessage());
    }


}
