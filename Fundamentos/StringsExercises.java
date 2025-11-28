public class StringsExercises {

    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.
        // 2. Muestra la longitud de una cadena de texto.
        // 3. Muestra el primer y último carácter de un string.
        // 4. Convierte a mayúsculas y minúsculas un string.
        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        // 6. Formatea un string con un entero.
        // 7. Elimina los espacios en blanco al principio y final de un string.
        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        // 9. Comprueba si dos strings son iguales.
        // 10. Comprueba si dos strings tienen la misma longitud.


        String name="Cristóbal";
        System.out.println("Hola "+"como estas?"); //1
        System.out.println("Hola mundo!".length()); //2
        System.out.println(name.charAt(0)+" "+name.charAt(name.length() - 1 )); //3
        System.out.println(name.toUpperCase() + "" + name.toLowerCase()); //4
        System.out.println("Hola mundo!".contains(name)); //5
        System.out.println(String.format("Hola, soy %s",name)); //6
        System.out.println("    Hola, me llamo Cristóbal y tengo 19       ".trim()); //7
        System.out.println("Hola, me llamo Cristóbal y tengo 19".replace(" ","-")); //8
        System.out.println("CrIsTóbAl".equalsIgnoreCase(name)); //9
        System.out.println(name.length() == "Brillante".length()); //10




    }
}
