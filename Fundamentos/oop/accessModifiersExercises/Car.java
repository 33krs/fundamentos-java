package oop.accessModifiersExercises;

public class Car {
    // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount)
    // que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

    private int speed;

    public Car(int speed){
        this.speed=speed;
    }

    public void accelerate(int amount){
        if(amount > 120 || amount <=0){
            System.out.println("Velocidad por encima de la máxima (max. 120km/h) o menor a la minima (min 1km/h)");
        }else{
            this.speed = amount;
            System.out.println("El vehiculo ha acelerado a "+speed+"km/h");
        }
    }
    public void brake(int amount){
        if (amount >= 120 || amount < 0){
            System.out.println("Velocidad no valida");
        }else{
            this.speed=amount;
            System.out.println("Has reducido hasta "+ speed + "km/h");
        }
    }

}
