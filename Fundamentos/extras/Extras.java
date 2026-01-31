package extras;

import oop.Classes;
import oop.Person;

import java.util.Scanner;


public class Extras {

    static String globalName = "krs";
    public static void main(String[] args){

        // Extras

        // null

        String name = "Brais";
        name = null;
        if (name != null) {
            System.out.println(name.toLowerCase());
        }

        // import

        new Person("Cris", 19, "1");
        new Classes();

        // Scanner

        var scanner = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);

        // Scope: variables globales y locales

        test();

        // static

    }

    public static void test() {
        System.out.println(globalName);
    }

}
