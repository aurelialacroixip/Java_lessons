package com.company;

public class Stud extends User {
    private String group;
    public Stud (Integer age, String name, Character sex, String group) {
        super(age, name, sex);
        this.group = group;
    }
    @Override
    public void printall() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
        System.out.println(this.group);
    }
}
