package oop;

public class Classes {
    public static void main(String[] args){
        var person = new Person("Cristobal", 19);

//        person.name="Cristobal";
//        person.age=19;

        person.sayHello();

        var person2= new Person("Alexis", 29);
        person2.sayHello();

    }
}


