package oop;

import java.text.Bidi;

public class Inheritance {

    public static void main(String[] args){
        //Herencia

        var animal1 = new Animal("Mi animal");
        animal1.name="Mi animal";
        animal1.eat();

        var dog = new Dog("Cris");
        dog.name="Cris";

        var cat = new Cat("Cat");
        cat.name="Cat";

        var bird = new Bird("Pajarillo");
        bird.name="Pajarillo";
        bird.eat();
        bird.fly();

    }

    public static class Animal {
        String name;

        public Animal(String name){

        }
        public void eat(){
            System.out.println("El animal con nombre " + name + " esta comiendo");
        }

    }

    public static class Dog extends Animal{

        public Dog(String name) {
            super(name);
        }

        @Override
        public void eat(){
            System.out.println("El perro con nombre "+ name +" esta comiendo");
        }

    }

    public static class Cat extends Animal{


        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal{


        public Bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("Esta volando");
        }

    }


}
