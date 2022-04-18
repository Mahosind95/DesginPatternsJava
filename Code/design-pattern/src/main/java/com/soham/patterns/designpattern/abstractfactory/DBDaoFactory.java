package com.soham.patterns.designpattern.abstractfactory;

public class DBDaoFactory extends DaoAbstractFactory {
 
    @Override
    public Dao createDao(String type) {
        Dao dao = null;
        if(type.equals("Emp")){
            dao = new DBEmpDao();
        }
        else if(type.equals("Dept")){
            dao = new DBDeptDao();
        }   
        return dao;
    }

}
