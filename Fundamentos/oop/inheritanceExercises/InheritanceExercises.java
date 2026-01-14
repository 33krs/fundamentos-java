package oop.inheritanceExercises;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args){
        // 1. Crea una clase Vehicle con un metodo move(). Luego crea una subclase Car que herede de Vehicle y agrega el metodo honk(). x
        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un metodo study(). x
        // 3. Crea una clase Animal con el metodo makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese metodo. x
        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department. x
        // 5. Crea una clase abstracta Shape con un metodo calculateArea(). Luego implementa ese metodo en Circle y Rectangle.x
        // 6. Crea una clase Bird con el metodo fly(). Luego crea Eagle que sobrescriba fly() pero también llame al metodo original con super.fly(). x
        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”. x
        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un metodo addInterest(). x
        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un metodo describe() sobrescrito. xxxx
        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound(). x

        var dog = new Dog();
        var cat = new Cat();
        var bird = new Bird();


        var animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        for(Animal animales : animals){
            animales.makeSound();
        }


    }


}
