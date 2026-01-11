package oop.accessModifiersExercises;

public class Book {
    // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle()
    //  pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.

    private final String title;

    public Book(String title){
        this.title=title;
    }

    public String getTitle(){
        return title;
    }

}
