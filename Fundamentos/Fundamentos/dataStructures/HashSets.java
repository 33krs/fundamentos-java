package Fundamentos.dataStructures;

import java.util.HashSet;

public class HashSets {

    public static void main(String[] args){

        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        //The size
        System.out.println(names.size());

        //Add elements (duplicates are not allowed)
        names.add("Fierro");
        names.add("Alexis");
        names.add("Cristobal");
        names.add("Alexis"); //no se agrega
        System.out.println(names.size());
        System.out.println(names);

        numbers.add(3);
        numbers.add(4);
        numbers.add(10);

        //Eliminar elementos
        names.remove("Cristobal");
        System.out.println(names.size());

        //Buscar elementos
        System.out.println(names.contains("Cristobal"));
        System.out.println(names.contains("Alexis"));

        //Conjuntos
        //names.addAll(numbers); ERROR (data types)

        var countries = new HashSet<String>();
        countries.add("Chile");
        countries.add("Argentina");
        countries.add("USA");
        countries.add("Cristobal");

        names.addAll(countries);


        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);


    }
}
