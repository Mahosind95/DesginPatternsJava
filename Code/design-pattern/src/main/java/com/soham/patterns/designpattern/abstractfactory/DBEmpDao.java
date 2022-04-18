package com.soham.patterns.designpattern.abstractfactory;

public class DBEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving Employee to DB");
    }
    
}
