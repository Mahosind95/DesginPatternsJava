package com.soham.patterns.designpattern.factory;

public class PizzaStore {
    
    public Pizza orderPizza(String type){
        
        Pizza piz = PizzaFactory.createPizza(type);

        piz.prepare();
        piz.bake();
        piz.cut();

        return piz;
    }
}
