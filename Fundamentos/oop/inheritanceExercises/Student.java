package oop.inheritanceExercises;

public class Student extends Person{
    // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un metodo study().

    int grade;

    public Student(String name, int age, int grade){
        super(name, age);
        this.grade=grade;

    }

    public void study(){
        System.out.println("El estudiante esta estudiando");
    }

}
