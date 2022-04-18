package com.soham.patterns.designpattern.abstractfactory;

public class XMLDaoFactory extends DaoAbstractFactory{

    @Override
    public Dao createDao(String type) {
        
        Dao dao = null;
        if(type.equals("Emp")){
            dao = new XMLEmpDao();
        }
        else if(type.equals("Dept")){
            dao = new XMLDeptDao();
        }

        return dao;

    }
    
}
