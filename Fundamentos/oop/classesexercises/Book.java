package oop.classesexercises;

public class Book {

    // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
    // 3. Añade un constructor a la clase Book que reciba title y author.

    String name;
    String author;

    public Book(String name, String author){
        this.name = name;
        this.author=author;


    }

    public void viewInformation(){
        System.out.println("Nombre del libro: "+name+", Autor: "+author);
    }

}
