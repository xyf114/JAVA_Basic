package com.basic.Class;

public class MethodExercise {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        p.age = 18;
        Person p2;
        Tool tool = new Tool();
        p2 = tool.copytool(p);

        System.out.println(p2.name + p2.age);
    }
}

class Person{
    String name;
    int age;
}

class Tool{
    Person copytool(Person person){
//        Person coyp_person = person;
//        return coyp_person;
        Person copy_person = new Person();
        copy_person.age = person.age;
        copy_person.name = person.name;
        return copy_person;
    }
}