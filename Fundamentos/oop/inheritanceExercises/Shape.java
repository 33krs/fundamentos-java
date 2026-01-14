package oop.inheritanceExercises;

abstract class Shape {
    // 5. Crea una clase abstracta Shape con un metodo calculateArea(). Luego implementa ese metodo en Circle y Rectangle.

    int width, height;

    public Shape(int width, int height){
        this.width=width;
        this.height=height;
    }

    public Shape() {

    }

    public void calculateArea(){
        int area = width*height;
        System.out.println("El area es: "+area);
    }

}
