public class BeginnerExercises {

    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        // 2. Crea una variable de tipo int y asígnale tu edad.
        // 3. Crea una variable double con tu altura en metros.
        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        // 5. Declara una constante con tu email.
        // 6. Crea una variable de tipo char y guárdale tu inicial.
        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        // 9. Imprime el tipo de dos variables creadas anteriormente.
        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.

        String name="Cristobal"; //1
        int age=19; //2
        double height=1.78; //3
        boolean programming=true; //4, programando
        final String EMAIL="cristobal@gmail.com";//5
        char initial='C'; //6
        String city="Concepcion";
        System.out.println("Vivo en "+city);
        city="New York City";
        System.out.println("Pero me gustaria vivir en "+city); //7
        int a=28, b=3;
        System.out.println("La suma de "+a+" y "+b+" es igual a : "+ (a+b)); //8
        System.out.println("El tipo de la variable age es: "+int.class.getName()+
                "\nEl tipo de la variable height es: "+double.class.getName()); //9
        //System.out.println(foul); //10
        boolean foul=false;
        System.out.println(foul);


    }
}
