package oop.classesexercises;

public class Car {

    // 4. Crea una clase Car con atributos brand y model y un metodo showData().
    String brand, model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;

    }

    public void showData(){
        System.out.println("Marca del auto: "+ brand +", Modelo: "+model);
    }


}
