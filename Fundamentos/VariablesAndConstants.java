public class VariablesAndConstants {
    //Variables y constantes
    public static void main(String[] args){

        //Variables
        String name = "Cristobal";
        int age = 19;
        double height = 1.78;
        var weight = "67kg";
        //"var" es una palabra reservada para crear variables automaticamente, dependiendo del tipo que se le asigne despues
        System.out.println("Mi nombre es: "+name+", tengo "+age+" años, mido "+height+" y peso "+weight);

        //Constantes(una buena practica es escribirlas en mayusculas)
        final String EMAIL= "cristobal@gmail.com";
        System.out.println(EMAIL);

    }
}
