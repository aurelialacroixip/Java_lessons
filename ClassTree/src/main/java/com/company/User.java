package com.company;

import javax.lang.model.element.Name;

abstract class User {
    protected Integer age;
    protected String name;
    protected Character sex;
    public User (Integer age, String name, Character sex){
        this.age = age;
        this.name = name;
        this.sex = sex;
    }
    abstract public void printall();
}
