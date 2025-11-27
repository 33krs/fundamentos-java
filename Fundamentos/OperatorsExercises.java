public class OperatorsExercises {

    public static void main(String[] args) {
        // 1. Crea una variable con el resultado de cada operación aritmética.
        // 2. Crea una variable para cada tipo de operación de asignación.
        // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
        // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        // 5. Utiliza el operador lógico and.
        // 6. Utiliza el operador lógico or.
        // 7. Combina ambos operadores lógicos.
        // 8. Añade alguna negación.
        // 9. Imprime 3 ejemplos de uso de operadores unarios.
        // 10. Combina operadores aritméticos, de comparación y lógicos.

        int resultado = 2 + 3;
        int c = resultado * 2;
        int a = 2, b = 3;

        System.out.println(a == a);
        System.out.println(a != c);
        System.out.println(resultado == (a+b));

        System.out.println(a != a);
        System.out.println(resultado < 2);
        System.out.println(c > 30);

        System.out.println((a == a) || (b == 3) );
        System.out.println((a==2) && (c == 9));

        System.out.println((a==2) || ((b<2) && (b==2)));
        System.out.println((a==2) || ((b<2) && !(b==2)));

        System.out.println(-a);
        System.out.println(-b);
        System.out.println(++b);


        int d=a+b+2, e=b-a+2;
        System.out.println( (d < e) || ( (3 + 2) == 5 ) );


    }

}
