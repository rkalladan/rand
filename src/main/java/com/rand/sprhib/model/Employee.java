package com.rand.sprhib.model;

public class Employee {
	private String id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return "Id = " + id + ", Name = " + name + ", Age = "
            + age + ", Salary = " + salary;
    }
}