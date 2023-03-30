package org.example.comparable;

public class Student implements Comparable<Student>{
    String name;
    Integer age;
    Integer id;

    Student(String name, Integer age, Integer id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    @Override
    public String toString(){
        return "Student [name " + name + ", age " + age + ", id " + id + "]";
    }

    @Override
    public int compareTo(Student s){
        return this.age-s.age;
    }


}
