public class Conditionals {

    public static void main(String[] args){
        //Condicionales
        var age=19;

        if (age>18) {
            System.out.println("El usuario es mayor de edad");
        }else if (age == 18){
            System.out.println("El usuario acaba de cumplir la mayoria de edad");
        } else{
            System.out.println("El usuario es menor de edad");
        }

        //Switch

        var day = 1;

        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("No es ninguno");
        }


    }
}
