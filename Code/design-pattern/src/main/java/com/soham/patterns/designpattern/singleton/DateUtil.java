package com.soham.patterns.designpattern.singleton;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

    public static final long serialVersionUID = 1L;
    //make it volatile to be thread safe. 
    private static volatile DateUtil instance;
    private DateUtil(){

    }
    
    public static  DateUtil getInstance(){
       // creating a synchronized block is expensive so we do it only when it's null
       if(instance == null){ 
        synchronized (DateUtil.class){
                if(instance == null){
                    instance = new DateUtil();
                }
            }
        }
        
        return instance;
    }

    protected Object readResolve(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
