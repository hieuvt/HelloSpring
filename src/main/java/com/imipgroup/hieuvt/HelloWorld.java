package com.imipgroup.hieuvt;

/**
 * Created by hieuvt on 9/29/2014.
 */
public class HelloWorld {
    private String message;

    public HelloWorld(){
        System.out.println("Inside HelloWorld constructor");
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void checkSpelling(){
        System.out.print("Checking spelling");
    }
}
