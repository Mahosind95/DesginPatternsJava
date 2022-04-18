package com.soham.patterns.designpattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {
    
    public static void main(String[] args) {
        
        DateUtil instance1 = DateUtil.getInstance();
        DateUtil instance2 = null;

        Constructor[] constructors = DateUtil.class.getDeclaredConstructors();
        for(Constructor constructor: constructors ){
            constructor.setAccessible(true);
            try {
                instance2 = (DateUtil) constructor.newInstance();
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException e) {
                e.printStackTrace();
            }
            break;
        }

        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());

    }
}
