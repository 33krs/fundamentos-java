public class HelloWorldExercises {
    //Ejercicios muy sencillos de println
    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // 4. Crea un comentario en varias líneas.
        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        // 7. Utiliza varios println para imprimir una frase.
        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        // 9. Intenta ejecutar el programa sin el metodo main y observa el error.
        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

        System.out.println("Cristobal\n"); //1, Imprimir mi nombre
        System.out.println("Hola\nMundo!\n"); //2, Imprimir dos lineas con un println
        /*El 3ro ya hecho
         * Y el 4to esta aca tambien */
        System.out.println("Edad: 19\nColor Favorito: Negro(si lo concideramos como color)\nCiudad favorita: Tokio");//5
        System.err.println("Err, color rojo?, error?"); //6, al parecer los .err son errores(? y van al final
        System.out.println("Habia una vez");
        System.err.println("Camaron que se duerme");
        System.out.println("No encuentro mas sysout.x.println");

        System.out.println("         ______________\n" +
                "        /             /|\n" +
                "       /             / |\n" +
                "      /____________ /  |\n" +
                "     | ___________ |   |\n" +
                "     ||           ||   |\n" +
                "     ||           ||   |\n" +
                "     ||           ||   |\n" +
                "     ||___________||   |\n" +
                "     |   _______   |  /\n" +
                "    /|  (_______)  | /\n" +
                "   ( |_____________|/\n" +
                "    \\\n" +
                ".=======================.\n" +
                "| ::::::::::::::::  ::: |\n" +
                "| ::::::::::::::[]  ::: |\n" +
                "|   -----------     ::: |\n" +
                "`-----------------------'");

        System.out.println("\n" +
                "                      .888\n" +
                "                    .8888'\n" +
                "                   .8888'\n" +
                "                   888'\n" +
                "                   8'\n" +
                "      .88888888888. .88888888888.\n" +
                "   .8888888888888888888888888888888.\n" +
                " .8888888888888888888888888888888888.\n" +
                ".&&&&&&&&&&&&&&&&&&&&&&&&&&\n" +
                "&&&&&&&&&&&&&&&&&&&&&&&&&&\n" +
                "&&&&&&&&&&&&&&&&&&&&&&&&&\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "@@@@@@@@@@@@@@@@@@@@@@@@@\n" +
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\n" +
                "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\n" +
                "`%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%.\n" +
                " `00000000000000000000000000000000000\n" +
                "  `000000000000000000000000000000000\n" +
                "   `0000000000000000000000000000000\n" +
                "     `###########################\n" +
                "jgs `#######################'\n" +
                "         `#########''########'");


    }
}