package oop.accessModifiersExercises;

public class Product {
    // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.

    private double price;
    String name;

    public Product(String name, double price){
        this.name=name;
        this.price=price;

    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
            System.out.println("El nuevo precio es de: "+this.price);
        }else System.out.println("Precio invalido");
    }



}
