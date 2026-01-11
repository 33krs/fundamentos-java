package oop;

public class Person {

    // 9. Crea varios objetos Person y guárdalos en un ArrayList.

    // Atributos
    protected String name;
    private int age;
    final private String id;

    // Constructor
    public Person(String name, int age, String id){
        this.name = name;
        this.age = age;
        this.id=id;

    }


    // Metodos
    public void sayHello(){
        System.out.println("Hola, soy "+name+" y tengo "+age+" años.");
    }


    // Getter
    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    // Setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Edad no válida");
        }
    }

}
