package oop.inheritanceExercises;

import java.lang.annotation.ElementType;

public class Bird extends Animal{
    // 6. Crea una clase Bird con el metodo fly(). Luego crea Eagle que sobrescriba fly() pero también llame al metodo original con super.fly().

    public void fly(){
        System.out.println("El pajaro vuela");
    }

    @Override
    public void makeSound(){
        System.out.println("Ruido de pajaro(?");
    }

}
