public class ConditionalsExercises {

    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        // 3. Dado un número, verifica si es positivo, negativo o cero.
        // 4. Crea un programa que diga si un número es par o impar.
        // 5. Verifica si un número está en el rango de 1 a 100.
        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        // 9. Crea un programa que diga si una letra es vocal o consonante.
        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

        var age = 14;

        if(age >= 18 ) System.out.println("El usuario esta habilitado para votar");
        else System.out.println("El usuario NO esta habilitado para votar");

        int numA=20, numB=21;
        if(numA > numB ){
            System.out.println("El número A es mayor al número B");
        }else if(numA<numB){
            System.out.println("El número B es mayor al número A");
        }else if(numA==numB){
            System.out.println("El número A es igual al número B");
        }

        int num=-123;
        if(num > 0){
            System.out.printf("El número %d es positivo%n",num);
        }else if(num < 0 ){
            System.out.printf("El número %d es negativo%n",num);
        }else{
            System.out.println("El número es cero");
        }

        int parImpar = 33 ;
        if(parImpar % 2 == 0){
            System.out.printf("El número %d es par",parImpar);
        }else if(parImpar % 2 == 1){
            System.out.printf("El número %d es impar%n",parImpar);
        }

        int numero = 100;
        if(numero > 1 && numero <=100){
            System.out.println("El número esta dentro del rango entre 1 - 100");
        }else System.out.printf("El número %d esta fuera del rango entre 1 - 100%n",numero);


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
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        var nota = 90;
        System.out.printf("Tu nota es %d sobre 100, por lo tanto es un: ", nota);
        if (nota <= 59){
            System.out.printf("Reprobado%n");
        }else if (nota > 59 && nota <= 89 ){
            System.out.printf("Aprobado%n");
        }else System.out.printf("Sobresaliente%n");


//        int age2 = 15;
//        System.out.printf("Tienes %d años, por lo tanto: ",age2);
//        if(age2 < 15 ){
//            System.out.printf("debes ir acompañado de un adulto%n");
//        }else if(age2 >= 15) System.out.printf("puedes ingresar%n");

        int age2 = 14;
        boolean accompanied = true;
        if(age2 >= 15 ){
            System.out.printf("Tienes %d años, puedes entrar%n",age2);
        }else if( age2 < 15 && accompanied ){
            System.out.printf("Tienes %d años, pero vas acompañado, puedes entrar.%n",age2);
        }else if (age2 < 15 && !accompanied){
            System.out.printf("Tienes %d años y no vas acompañado, NO puedes entrar.%n",age2);
        }




        char vocalConsonante = 'A';
        String vocales = "aeiou";
        vocalConsonante= Character.toLowerCase(vocalConsonante);

        if(vocales.indexOf(vocalConsonante) >= 0){
            System.out.println("La letra es vocal");
        }else System.out.println("La letra es consonante");


        int a = 10, b = 20, c = 15;
        int mayor = a;

        if(b > mayor) mayor = b;
        if(c > mayor) mayor = c;

        System.out.printf("El número mayor es %d %n", mayor);

    }
}
