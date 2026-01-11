package oop.accessModifiersExercises;

public class Rectangle {
    // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.

    private int width, height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public void setWidth(int width){
        this.width=width;
    }

    public void setHeight(int height){
        this.height=height;
    }

    public void calculateArea(){
        int area = width * height;
        System.out.println("El area es: "+area);
    }

}
