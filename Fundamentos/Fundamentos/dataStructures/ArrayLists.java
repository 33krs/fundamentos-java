package Fundamentos.dataStructures;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){

        //Declatation and creation
        ArrayList<String> names = new ArrayList<>();
        var numbers = new ArrayList<Integer>();

        System.out.println(names.size());

        //Add elements
        names.add("Alexis");
        names.add("Cristobal");
        names.add("Fierro");
        System.out.println(names.size());

        //Access the elements
        System.out.println(names.getFirst());
        System.out.println(names.getLast());
        System.out.println(names.get(1));

        //Changes
        names.set(2, "cristobal@gmail.com");
        System.out.println(names.getLast());

        //Delete elements
        names.remove(2);
        System.out.println(names.get(1));
        System.out.println(names.size());

        //Search elements
        System.out.println(names.contains("Cristobal"));
        System.out.println(names.contains("cristobal@gmail.com"));

        //Clear ArrayList
        names.clear();
        System.out.println(names.size());





    }
}
