package oop.inheritanceExercises;

public class Circle extends Shape{
    // 5. Crea una clase abstracta Shape con un metodo calculateArea(). Luego implementa ese metodo en Circle y Rectangle.


    int radio;
    public Circle(int radio){
        super();
        this.radio=radio;

    }

    @Override
    public void calculateArea() {
        double area = Math.PI * (radio * radio);
        System.out.println("El area del circulo es: "+area);
    }

}
