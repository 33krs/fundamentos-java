package oop.accessModifiersExercises;

public class Employee {
    // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.

    private double salary;
    String name;

    public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }

    public void raiseSalary(double percent){
        if(percent <= 0){
            System.out.println("Porcentaje no válido (cero o negativo)");
        }else{
            salary = salary * (1 + (percent / 100));
            System.out.printf("El salario de %s, ha aumentado a %.2f\n", name, salary);
        }
    }

}
