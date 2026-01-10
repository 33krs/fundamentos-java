package oop.classesexercises;

import Fundamentos.dataStructures.ArrayLists;
import Fundamentos.dataStructures.Arrays;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args){
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos. x
        // 2. Crea una clase Dog con un metodo bark() que imprima su sonido. x
        // 3. Añade un constructor a la clase Book que reciba title y author. x
        // 4. Crea una clase Car con atributos brand y model y un metodo showData(). x
        // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60). x
        // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo. x
        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro. x
        // 8. Crea una clase Worker que reciba nombre y salario, y un metodo para mostrar su salario. x
        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.

        var libro = new Book("Animal Farm", "George Orwell");
        libro.viewInformation();

        var perro = new Dog("Piraña");
        perro.bark();

        var auto= new Car("KIA", "Morning");
        auto.showData();

        var estudiante = new Student("Cristobal", 40);
        System.out.println(estudiante.name +", nota: "+estudiante.score+", aprobo?: "+estudiante.aprobo());

        var cuentaDeBanco = new BankAccount();
        cuentaDeBanco.balance=0;
        cuentaDeBanco.deposit(3000);

        var rectangulo = new Rectangle(2,6);
        rectangulo.calculateArea();
        rectangulo.calculatePerimeter();

        var trabajador = new Worker("Alexis", 50);
        trabajador.showSalary();


        // 9. Crea varios objetos Person y guárdalos en un ArrayList.

        var person1 = new Person("Cristobal", 19);
        var person2 = new Person("Alexis", 20);
        var person3 = new Person("Sinaka", 23);
        var person4 = new Person("Easykid", 28);

        var persons = new ArrayList<Person>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        //Ahora esta almacenado, pero para poder llamarlo y que los muestre, faltaria agregarle el metodo ToString

        var product1 = new Product("Chocolate", 1000);
        product1.discount(20);




    }
}
