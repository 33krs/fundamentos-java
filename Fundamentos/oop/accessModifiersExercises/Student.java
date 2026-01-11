package oop.accessModifiersExercises;

public class Student {
    // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.

    private int grade;
    public String name;

    public Student(String name, int grade){
        this.name=name;
        this.grade=grade;
    }

    public void setGrade(int grade){
        this.grade=grade;
        System.out.println("Nota actualizada: "+grade);
    }
    public boolean isPassed(){
        return (grade >= 60);
    }



}
