package extras;

import java.util.Scanner;

public class ExtrasExercises {

    static String message = "Mensaje global";

    static void main(String[] args) {
        // 1. Crea una variable de tipo String inicializada como null y verifica que no esté vacía antes de usarla. x
        // 2. Escribe un programa que lea el nombre y edad del usuario usando Scanner. x
        // 3. Declara una constante final llamada MAX_SCORE con valor 100 y muéstrala. x
        // 4. Crea una variable global message y otra local message dentro del metodo main(). Muestra ambas. x
        // 5. Usa import java.util.Scanner; para leer un número y mostrar si es positivo o negativo. x
        // 6. Declara una variable static en una clase y accede a ella desde main() sin crear un objeto.
        // 7. Importa java.util.Random y genera un número aleatorio del 1 al 10.
        // 8. Crea una clase con comentarios adecuados explicando cada sección del código.
        // 9. Define una clase User con una constante APP_NAME, una variable global username y una función que imprima ambas.
        // 10. Haz debug del código implementado haciendo uso de sus diferentes herramientas.

        String nulo = "Brais";
        nulo = null;
        if (nulo != null) {
            System.out.println(nulo.toLowerCase());
        }

        var scanner = new Scanner(System.in);
        System.out.println("Indica tu nombre: ");
        var name = scanner.next();
        System.out.println("Indica tu edad: ");
        var age = scanner.nextInt();

        final int MAX_SCORE = 100;
        System.out.println("El score maximo es de: "+MAX_SCORE);

        String message = "Mensaje local";
        System.out.println(message);
        globalMessage();

        System.out.println("Indique un numero: ");
        var number = scanner.nextInt();
        if(number < 0) System.out.println("El numero es negativo");
        else System.out.println("El numero es positivo");

    }

    public static void globalMessage(){
        System.out.println(message);
    }
}
