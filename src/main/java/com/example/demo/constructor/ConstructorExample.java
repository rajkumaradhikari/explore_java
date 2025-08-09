package com.example.demo.constructor;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(Person p){
        this.name  = p.name;
        this.age   = p.age;
    }

    void display(){
        System.out.println("Name : "+name + " Age : "+age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        Person person = new Person("Michel",33);
        Person person1 = new Person(person);
        person1.display();
    }
}
