package oop.inheritanceExercises;

public class Eagle extends Bird{
    // 6. Crea una clase Bird con el metodo fly(). Luego crea Eagle que sobrescriba fly() pero también llame al metodo original con super.fly().

    @Override
    public void fly(){
        super.fly();
    }
}
