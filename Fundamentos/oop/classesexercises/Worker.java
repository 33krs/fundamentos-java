package oop.classesexercises;

public class Worker {
    // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario.

    String name;
    int salary;

    public Worker(String name, int salary){
        this.name=name;
        this.salary=salary;
    }

    public void showSalary(){
        System.out.println("El salario de "+name+" es: "+salary+"$");
    }

}
