package Exceptions;

import javax.swing.*;

public class ExceptionsExercises {
    public static void main(String[] args) throws CustomException {
        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch. x
        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException. x
        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.x
        // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException). x
        // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error. x
        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo. x
        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50. x
        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException. x
        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta. x
        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.


        // 1. Divide dos números almacenados en dos variables. Maneja la división por cero con try-catch.
        try{
            int a=5, b=0;
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 2. Crea un array de 3 elementos e intenta acceder al índice 5. Captura el ArrayIndexOutOfBoundsException.
        String[] elements ={"krs", "srk", "kaiser"};
        try{
            System.out.println(elements[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e.getMessage());
        }

        // 3. Crea una variable String nula e intenta imprimir su longitud. Maneja el NullPointerException.
        try{
            String nulo = null;
            System.out.println(nulo.length());
        }catch(NullPointerException e){
            assert System.out != null;
            System.out.println("Error: "+e.getMessage());
        }

        System.out.println(textToNumber("1234a"));

        // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.

        validateNegative(1);

        // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
        new TemperatureChecker().validateTemperature(-50);


        // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
        int[] numeros = {1,2,3};
        try{
            operacion(numeros, 2, 2);
        }catch (ArithmeticException e){
            System.out.println("No se puede dividir por cero.");
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Indice con valor invalido");
            System.out.println(e.getMessage());
        }

        // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
        checkPassword("12345678");


        // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.
        LoginSystem sistema = new LoginSystem();
        try {
            sistema.verificarCredenciales("admin", "12345");
        } catch (LoginFailedException e) {
            System.err.println(" ALERTA DE SEGURIDAD: " + e.getMessage());

        } catch (Exception e) {
            System.err.println("Error desconocido del sistema");
        }

    }

    // 4. Escribe una función que transforma texto a número. Usa try-catch para manejar entradas no válidas (NumberFormatException).
    // 5. Escribe un programa con un bloque finally que se ejecute siempre, haya o no error.

    public static int textToNumber(String text){
        try{
            return Integer.parseInt(text);
        }catch (NumberFormatException e){
            System.out.println("Error: "+e.getMessage());
            return 0;
        }finally {
            System.out.println("Fin del programa textToNumber");
        }
    }

    // 6. Usa throw para lanzar un IllegalArgumentException si un número introducido es negativo.
    public static void validateNegative(int number) throws IllegalArgumentException{
        if(number < 0 ){
            throw new IllegalArgumentException(String.format("Numero %s no valido (negativo)", number));
        }else{
            System.out.printf("Numero %s registrado de forma exitosa\n", number);
        }

    }

    // 7. Crea una clase TemperatureChecker que lanza una excepción personalizada si la temperatura es menor a -50 o mayor a 50.
    public static class CustomException extends Exception{

        public CustomException(String message){
            super(message);
        }
    }

    public static class TemperatureChecker extends Exception{
        public void validateTemperature(int temperature) throws CustomException{
            if(temperature<-50 || temperature >50){
                throw new CustomException(String.format("Temperatura: %s grados, fuera de los limites\n", temperature));
            }else{
                System.out.printf("Temperatura: %s grados, dentro de los limites\n", temperature);
            }
        }
    }

    // 8. Crea un programa con varios bloques catch: uno para ArithmeticException, otro para ArrayIndexOutOfBoundsException.
    public static void operacion(int[] numbers,int indice, int number){
        int resultado= numbers[indice]/ number;
        System.out.println("El resultado es: "+resultado);

    }

    // 9. Crea una función checkPassword(String pass) que lance una excepción si la contraseña es demasiado corta.
    public static void checkPassword(String pass) throws CustomException {
        if(pass.length() < 8){
            throw new CustomException("Contrasenia demasiado corta (menor a 8 digitos)");
        }else System.out.println("Contrasenia ingresada con exito.");
    }


    // 10. Implementa una clase LoginSystem que use una excepción personalizada LoginFailedException si el usuario o contraseña son incorrectos.

    public static class LoginFailedException extends Exception {
        public LoginFailedException(String message) {
            super(message);
        }
    }


    public static class LoginSystem{

        private static final String USUARIO_REAL = "admin";
        private static final String PASS_REAL = "secure123";

        public void verificarCredenciales(String usuario, String password) throws LoginFailedException {
            if (!USUARIO_REAL.equals(usuario)) {
                throw new LoginFailedException("El usuario '" + usuario + "' no existe en el sistema.");
            }
            if (!PASS_REAL.equals(password)) {
                throw new LoginFailedException("La contraseña es incorrecta.");
            }
            System.out.println("Acceso concedido. Bienvenido " + usuario);
        }

    }




}
