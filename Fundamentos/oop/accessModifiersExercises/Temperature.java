package oop.accessModifiersExercises;

public class Temperature {
    // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.

    private double celsius;

    public Temperature(double celsius){
        this.celsius=celsius;
    }

    public void setCelsius(double celsius){
        if(celsius >= -100 && celsius <=100){
            this.celsius=celsius;
            System.out.println("La nueva temperatura es de: "+celsius+"C");
        }else System.out.println("Valor incorrecto");
    }

}
