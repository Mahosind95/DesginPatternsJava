package com.soham.patterns.designpattern.singleton;

public class Logger implements Cloneable{

    private static Logger instance;

    private Logger(){
        
    }

    public static Logger getInstance(){
        if(instance == null){
            synchronized(Logger.class){
                if(instance == null){
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

    public void log(String logStatement){
        System.out.println(logStatement);
    }
}
