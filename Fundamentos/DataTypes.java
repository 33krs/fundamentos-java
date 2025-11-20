public class DataTypes {
    //Tipos de datos
    public static void main(String[] args){
        //Tipos de datos primitivos
        int myInt= 33; //enteros
        System.out.println(myInt);
        double myDouble=1.78; //decimales
        System.out.println(myDouble);
        //float, long, byte

        char myChar='C'; //caracteres
        System.out.println(myChar);

        boolean myBoolean= true;//booleanos (verdadero o falso)
        System.out.println(myBoolean);

        String myString= "Hola Mundo!"; //este no es un tipo de dato primitivo, es una clase
        System.out.println(myString);

        //Tipo de dato en tiempo de complicacion
        System.out.println(myString.getClass().getSimpleName()); //obtengo el tipo de dato de la clase mediante getClass


    }

}
