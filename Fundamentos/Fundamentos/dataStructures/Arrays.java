package Fundamentos.dataStructures;

public class Arrays {

    public static void main(String[] args){

        //Declaración, creación y acceso
        int[] numbers = new int[3];
        System.out.println(numbers[2]);

        String[] names = {"Cristóbal", "Fierro", "kaiseR"};
        System.out.println(names[2]);

        //Modificación
        numbers[0] = 33;
        numbers[1] = 10;

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);


        names[2]="cristobal@gmail.com";
        System.out.println(names[2]);
        System.out.println(names.length);


    }
}
