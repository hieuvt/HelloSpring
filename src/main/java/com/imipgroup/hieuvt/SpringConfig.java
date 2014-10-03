package com.imipgroup.hieuvt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by hieuvt on 10/3/2014.
 */

@Configuration
public class SpringConfig {

    @Bean
    public HelloWorld helloWorld(){ return new HelloWorld(); }

    @Bean
    public HelloWorldCaller helloWorldCaller() { return new HelloWorldCaller();}
}
