package oop.inheritanceExercises;

public class Manager extends Employee{
    // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.

    String department;
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department=department;
    }



}
