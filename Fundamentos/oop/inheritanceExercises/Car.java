package oop.inheritanceExercises;

public class Car extends Vehicle {
    // 1. Crea una clase Vehicle con un metodo move(). Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk().

    public Car(int speed){
        super(speed);
    }

    public String honk(){
        return "Honk honk!";
    }


}
