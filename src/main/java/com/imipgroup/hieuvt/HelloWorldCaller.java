package com.imipgroup.hieuvt;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hieuvt on 10/3/2014.
 */
public class HelloWorldCaller {

    @Autowired
    private HelloWorld helloWorld;

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }
    public void spellCheck() {
        helloWorld.checkSpelling();
    }
}
