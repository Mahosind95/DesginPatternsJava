package com.soham.patterns.designpattern.abstractfactory;

public class DBDeptDao implements Dao{

    @Override
    public void save() {
        System.out.println("Saving Department to DB");
    }
    
}
