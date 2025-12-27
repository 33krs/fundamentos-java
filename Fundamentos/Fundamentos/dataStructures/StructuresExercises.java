package Fundamentos.dataStructures;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StructuresExercises {

    public static void main(String[] args){
        // 1. Crea un Array con 5 valores e imprime su longitud.
        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        // 3. Crea un ArrayList vacío.
        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        // 5. Crea un HashSet con 2 valores diferentes.
        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        // 7. Elimina uno de los elementos del HashSet.
        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        // 9. Modifica uno de los contactos y elimina otro.
        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        //var numbers[5] = {1,2,3,4,5};
        int[] numbers = {1,2,3,4,5};
        System.out.println(numbers.length);
        System.out.println("Valor del indice 2 antes: "+numbers[2]);
        numbers[3]=33;
        System.out.println("Valor del indice 2 despues: "+numbers[3]);

        ArrayList<String> names = new ArrayList<>();
        names.add("Hola");
        names.add("Como");
        names.add("Estas");
        names.add("Cristobal");
        names.add("Alexis");
        System.out.println(names);
        names.removeLast();
        System.out.println(names);


        //HashSet<String> names1 = new HashSet<>(Set.of("Cristobal", "Alexis"));
        var sinaka = new HashSet<>(Set.of("Reproduzcan", "Pongan"));
        System.out.println(sinaka);
        sinaka.add("Pongan");
        sinaka.add("Sinaka");
        System.out.println(sinaka);

        sinaka.remove("Pongan");
        System.out.println(sinaka);

        var numbers2 = new HashMap<String, Integer>(); //No puede ser primitivo
        numbers2.put("easykid", 619);
        numbers2.put("sinaka", 1234567);
        numbers2.put("kid vudu", 333);

        System.out.println(numbers2);
        numbers2.replace("sinaka", 123);
        numbers2.remove("kid vudu");
        System.out.println(numbers2);


        //Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        Integer[] descontrol = {1,2,3,4,5}; // si se crea como int[], entonces daria problemas en el .asList()

//        var reproduzcan = new ArrayList<Integer>(descontrol);
//        ArrayList<Integer> reproduzcan = new ArrayList<>(descontrol);

        List<Integer> lista = new ArrayList<Integer>(Arrays.asList(descontrol));

        System.out.println(lista);

//        s1naka.putAll(reproduzcan);
//        var s1naka = new HashMap<String, Integer>();

//        var reproduzcan = new HashSet<>(lista.stream().collect(Collectors.toMap(Function.identity(), Function.identity() )));
        HashMap<Integer, Integer> reproduzcan = new HashMap<>(lista.stream().collect(Collectors.toMap(Function.identity(), Function.identity())));
        System.out.println(reproduzcan);

    }
}
