package oop.inheritanceExercises;

public class Vehicle {
    // 1. Crea una clase Vehicle con un metodo move(). Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk().

    int speed;

    public Vehicle(int speed){
        this.speed=speed;
    }

    public void move(){
        System.out.println("El vehiculo se mueve a "+speed+"km/h");
    }





}
