package Fundamentos.dataStructures;

import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args){

        HashMap<String, String> names = new HashMap<>();
        var numbers = new HashMap<Integer, String>();

        //Size
        System.out.println(names.size());

        //Add elements
        names.put("Cristobal", "cristobal@gmail.com");
        names.put("Alexis", "alexis@gmail.com");
        names.put("kaiseR", "kaiser@gmail.com");
        System.out.println(names.size());

        System.out.println(names);

        //Access the elements
        System.out.println(names.get("Cristobal"));
        System.out.println(names.get("ICINF"));

        //Verify elements
        System.out.println(names.containsKey("Cristobal"));
        System.out.println(names.containsKey("ICINF"));
        System.out.println(names.containsValue("cristobal@gmail.com"));

        //Delete items
        names.remove("Cristobal");
        System.out.println(names);

        //Clean HashMap
        names.clear();
        System.out.println(names);

        //Modify elements
        names.put("Cris", "cris@gmail.com");
        System.out.println(names);

        names.put("Cris", "cristobal@gmail.com");
        System.out.println(names);


        names.replace("krs", "krs@gmail.com"); //Replace only if it exists
        System.out.println(names);

        names.putIfAbsent("krs", "krs@gmail.com"); //Add elements only if it doesnt exist
        System.out.println(names);


        System.out.println(names.values());
    }
}
