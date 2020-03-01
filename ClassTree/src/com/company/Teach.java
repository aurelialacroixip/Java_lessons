package com.company;

public class Teach extends User {
    private Float experience;
    public Teach (Integer age, String name, Character sex, Float experience) {
        super(age, name, sex);
        this.experience = experience;
        }
    public void printall() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.sex);
        System.out.println(this.experience);
    }
}
