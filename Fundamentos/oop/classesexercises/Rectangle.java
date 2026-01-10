package oop.classesexercises;

public class Rectangle {
    // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
    int height;
    int width;

    public Rectangle(int height, int width){
        this.height=height;
        this.width=width;
    }

    public void calculateArea(){
        int area = height * width;
        System.out.println("El area del rectangulo es: " + area);
    }

    public void calculatePerimeter(){
        int perimeter = 2 * (height + width);
        System.out.println("El perimetro del rectangulo es: "+ perimeter);
    }

}
