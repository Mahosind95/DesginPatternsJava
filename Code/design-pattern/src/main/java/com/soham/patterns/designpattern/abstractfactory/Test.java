package com.soham.patterns.designpattern.abstractfactory;

public class Test {
    public static void main(String[] args) {
        DaoAbstractFactory daf = DaoFactoryProducer.produce("XML");
        Dao dao = daf.createDao("Emp");
        dao.save();
    }
    
}
