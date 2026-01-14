package oop.inheritanceExercises;

public class Cat extends Animal{
    // 3. Crea una clase Animal con el metodo makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese metodo.

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

}
