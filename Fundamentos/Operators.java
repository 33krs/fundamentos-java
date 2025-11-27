public class Operators {

    public static void main(String[] args){
        //Operadores aritméticos
        var a=10;
        var b=8;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //Operadores de asignación

        a = b; //le asigna B a A
        System.out.println(a);

        a = b * 3;
        System.out.println(a);

        a +=1;//Le sumo 1 al valor de a, a = a + 1
        System.out.println(a);
        a -=1;
        System.out.println(a); //a=a-1
        a /=2;
        System.out.println(a); //a=a/2
        a *=2;
        System.out.println(a);//a=a*2
        a %=2;
        System.out.println(a);

        //Operadores de comparación (relacionales)
        a=7;
        System.out.println(a == b);
        System.out.println(a == 6);
        System.out.println(a != 6);

        System.out.println(a < 6);
        System.out.println(a <= 6);
        System.out.println(a > 6);
        System.out.println(a >= 6);

        //Operadores lógicos

        // Y (and)
        System.out.println(true && true);

        // O (or)
        System.out.println(true || false);

        // NO (not)
        System.out.println(!true);
        System.out.println(!false);

        //Operadores unarios

        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);//Imprime y luego aumenta el valor
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);//Imprime y luego disminuye el valor
        System.out.println(b);





    }
}
