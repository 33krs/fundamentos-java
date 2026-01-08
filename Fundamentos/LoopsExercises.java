import java.awt.color.ICC_ColorSpace;
import java.util.*;

public class LoopsExercises {
    public static void main(String[] args){
        // 1. Imprime los números del 1 al 10 usando while. x
        // 2. Usa do-while para mostrar todos los valores de un ArrayList. x
        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for. x
        // 4. Recorre un Array de 5 números e imprime la suma total. x
        // 5. Usa un for para recorrer un Array y mostrar sus valores. x
        // 6. Usa for-each para recorrer un HashSet y un HashMap. x
        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for. x
        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20. x
        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array. x
        // 10. Crea un programa que calcule el factorial de un número dado.

        int i=0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }


        String[] namesToAdd = {"Cristobal", "Alexis", "Sinaka", "Easykid"};
        ArrayList<String> names = new ArrayList<>();
        Collections.addAll(names, namesToAdd);
//        ArrayList<String> names = new ArrayList<>(List.of("Cristobal", "Alexis","Sinaka","Easykid"));

        do {
            System.out.println(names.getFirst());
            names.removeFirst();
        }while(!names.isEmpty());


        int multiplosDeCinco = 0;
        for(i = 0; i<50; i+=5){
            System.out.println(multiplosDeCinco+=5);
        }


        i=0;
        int suma = 0;
        int[] numbers={1,2,4,5,6};
        for(i=0 ; i < numbers.length; i++){
            suma= suma + numbers[i];
            System.out.println(suma);
        }

        i=0;
        for(i=0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var countries = new HashSet<String>();
        countries.add("Chile");
        countries.add("Argentina");
        countries.add("USA");
        countries.add("Cristobal");

        for(String pais: countries){
            System.out.println(pais);
        }

        HashMap<String, String> names2 = new HashMap<>();
        names2.put("Cristobal", "cristobal@gmail.com");
        names2.put("Alexis", "alexis@gmail.com");
        names2.put("kaiseR", "kaiser@gmail.com");

        for(Map.Entry<String, String> nombre: names2.entrySet()){
            System.out.println(nombre);
            System.out.println(nombre.getKey());
            System.out.println(nombre.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("------------------");
        for(i = 10 ; i > 0 ; i--){
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for(i=0 ; i <= 20 ; i++){
            if(i % 3 == 0) continue;
            System.out.println(i);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("-------------------------------------------");
        int resultadoFactorial = 1;
        int factorial = 5;
//      MI version
//        for(i = 0; i < factorial ; i++){
//            for(int j = 0 ; j < factorial; j++){
//                resultadoFactorial = resultadoFactorial * factorial;
//                factorial--;
//            }
//        }
//        System.out.println(resultadoFactorial);
        // Version mejorada, se podria agregar un scanner y un print mas elaborado
        for(i = 1 ; i <= factorial ; i++){
            resultadoFactorial = resultadoFactorial * i;
        }
        System.out.println(resultadoFactorial);

    }
}
