package com.bleezmo;

/**
 * Created with IntelliJ IDEA.
 * User: josh
 * Date: 12/14/14
 * Time: 9:35 PM
 * #TODO
 */
public class HelloWorld {
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello "+name);
    }
}
