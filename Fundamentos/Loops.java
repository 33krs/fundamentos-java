import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args){

        // for

        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Hola, Java!");
        }

        String[] names = {"Alexis", "Cristobal", "Sinaka"};
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("---------------------------------");

        // for each

        for(String name : names){
            System.out.println(name);
        }

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for(Integer number: numbers){
            System.out.println(number);
        }


        HashMap<String, String> emails = new HashMap<>();
        emails.put("Cristobal", "cristobal@gmail.com");
        emails.put("Alexis", "alexis@gmail.com");
        emails.put("Easykid", "easykid@gmail.com");

        for(Map.Entry<String, String> email : emails.entrySet()){
            System.out.println(email);
            System.out.println(email.getKey());
            System.out.println(email.getValue());
        }

        System.out.println("-------------------");

        // while

        int i = 0;
        while(i < 5){
            System.out.println("Hola Mundo");
            i++;
        }

        i = 0;
        Boolean find = false;
//        while(i < names.length){
//            System.out.println(names[i]);
//            if(names[i].equals("Alexis")) System.out.println();;
//            i++;
//        }

        while(!find){
            System.out.println(names[i]);
            if(names[i].equals("Cristobal")){
                find = true;
            }
            i++;
        }

        System.out.println("--------------------");

        // do-while

        i = 0;
        do{
            System.out.println("Hola Java");
            i++;
        }while(i < 5);

        System.out.println("--------------------------------");

        // Control de bucles

        // break
        for (String name: names) {
            if (name.equals("Sinaka")) {
                break;
            }
            System.out.println(name);
        }

        // continue
        for (int index = 0; index < 5; index++) {
            if (index == 3) {
                continue;
            }
            System.out.println(index);
        }






    }
}
