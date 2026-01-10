package oop.classesexercises;

public class Student {
    // 5. Crea una clase Student con atributo score y un metodo que diga si aprobó (mayor o igual a 60).

    String name;
    int score;

    public Student(String name, int score){
        this.name = name;
        this.score=score;
    }


//    if (this.score >= 60) return true;
//        else return false;
    public boolean aprobo(){
        return this.score >= 60;
    }

}
