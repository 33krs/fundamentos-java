import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {
    public static void main(String[] args){
        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!". x
        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona. x
        // 3. Haz un metodo que reciba dos números enteros y devuelva su resta. x
        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).x
        // 5. Escribe una función que reciba un número y diga si es par o impar.x
        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario). x
        // 7. Implementa una función que reciba una cadena y retorne su longitud. x
        //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna. x
        // 9. Escribe un metodo que reciba un número y retorna su factorial. x
        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento. x

        bienvenidaAlCurso();
        saludoPersona("Cristobal");
        System.out.println(restaEntreNumeros(5, 2));
        System.out.println(cuadradoDeUnNumero(5));
        System.out.println(esParOImpar(2));
        System.out.println(esParOImpar(1));

        System.out.println(mayorDeEdad(18));
        String cadena= "La longitud de este string es de: ";
        System.out.println(longitudDeCadena(cadena));
        int[] valores = {10,10,34,23,54,9};
        System.out.println("La media es: "+calcularMedia(valores));

        System.out.println("El factorial de 5 es: "+calcularFactorial(5));
        var nombres = new ArrayList<>(Arrays.asList("Cristobal", "Alexis", "Sinaka"));
        recorrerArrayList(nombres);
    }

    public static void bienvenidaAlCurso(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    public static void saludoPersona(String nombre){
        System.out.println("Un saludo a " + nombre);
    }

    public static int restaEntreNumeros(int a, int b){
        return a-b;
    }

    public static int cuadradoDeUnNumero(int a){
        return a*a;
    }

    public static String esParOImpar(int a){
        if(a%2 == 0) return "El numero es par";
        else return "El numero es impar";
    }

    public static boolean mayorDeEdad(int a){
//        if(a>=18) return true;
//        else return false;
        return a>=18;
    }

    public static int longitudDeCadena(String cadena){
        return cadena.length();
    }

    public static double calcularMedia(int[] numeros){
        double media=0;
        int resultado=0;
        for(int total: numeros){
            resultado = resultado + total;
        }
        media = (double)resultado/numeros.length;
        return media;
    }

    public static int calcularFactorial(int numero){
        int resultadoFactorial = 1;
        for(int i = 1 ; i <= numero ; i++){
            resultadoFactorial = resultadoFactorial * i;
        }
        return resultadoFactorial;
    }

    public static void recorrerArrayList(ArrayList<String> lista){
        for(String elementos: lista) {
            System.out.println(elementos);
        }
    }

}
