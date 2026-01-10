package oop.classesexercises;

public class Product {
    // 10. Crea una clase Product y un metodo que aplique un descuento sobre su precio.

    String name;
    int price;

    public Product(String name, int price){
        this.name = name;
        this.price=price;
    }

    public void discount(int discountPercentage){
        double percentageToDecimal = (float)discountPercentage / 100;
        double finalDiscount = this.price * percentageToDecimal;

        double finalPrice = this.price - finalDiscount;

        System.out.printf("\nPrecio inicial de %s: %d, precio final: %.2f\n",this.name, this.price, finalPrice);


    }

}
