package oop.classesexercises;

public class Person {
    // 9. Crea varios objetos Person y guárdalos en un ArrayList.

    // Atributos
    String name;
    int age;

    // Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }


    // Metodos
    public void sayHello(){
        System.out.println("Hola, soy "+name+" y tengo "+age+" años.");
    }


}
