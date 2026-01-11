package oop.accessModifiersExercises;

public class User {
    // 6. Crea una clase User con los atributos privados username y password.
    // Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.

    private String username, password;

    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public void setUsername(String username){
        this.username = username;
        System.out.println("Su nuevo nombre de usuario es: "+username);
    }

    public void setPassword(String password){
        this.password=password;
        System.out.println("Se ha cambiado su contrase;a con exito. ");
    }

    public void checkPassword(String inputPassword){
        if(password.equals(inputPassword)){
            System.out.println("Las contraseñas son iguales");
        } else System.out.println("Las contraseñas son diferentes");

    }

}
