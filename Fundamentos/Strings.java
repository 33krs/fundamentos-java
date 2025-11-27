public class Strings {

    public static void main(String[] args){

        //Cadenas de textos

        //Declaración
        String name = "Cristóbal";
        var surname="Fierro";

        //Operaciones básicas

        //Concatenación
        System.out.println(name + " " + surname);

        //Length
        System.out.println(name.length());

        //Obtener caracter en x posición (n - 1)
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(name.length() - 1)); //Obtengo la ultima letra

        //Obtener una subcadena
        System.out.println(name.substring(3));
        System.out.println(name.substring(3, 7)); //excluye el valor del indice final

        //toUpperCase, toLowerCase (mayusculas y minusculas)
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name);

        //Contains (comprobar si tiene)
        System.out.println("Hello World".contains("Cris"));
        System.out.println("Hello World".contains("orld"));
        System.out.println("Hello World".contains("oRLd"));
        System.out.println("Hello World".toUpperCase().contains("WORLD"));

        //Equals (comparación)
        System.out.println(name.equals("Cristóbal"));
        System.out.println(name.equals("CrIstÓbaL"));
        System.out.println(name.toUpperCase().contains("CRISTÓBAL"));
        System.out.println(name.equalsIgnoreCase("CristÓbaL"));

        //Trim (quita los espacios en blanco al inicio y al final del string)
        System.out.println("     Hola, como  estas??       ");
        System.out.println("     Hola, como  estas??       ".trim());

        //Replace (reemplazo caracteres, por uno que se elija)
        System.out.println("     Hola, como  es tas ? ?       ".replace(" ", ""));
        System.out.println("     Hola, como  es tas ? ?       ".replace("Hola", "Chao"));

        //Format
        var age=19;
        System.out.println(String.format("Hola, %s, tengo %d años",name, age));
        String myStr="Hola, %s, tengo %d años";
        String result=String.format(myStr, name, age);
        System.out.println(result);






    }
}
