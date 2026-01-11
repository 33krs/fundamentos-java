package oop.accessModifiersExercises;

public class AccessModifiersExercises {
    public static void main(String[] args){
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase. x
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0. x
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente. x
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor. x
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.x
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

        var person1 = new Person("Cristobal", 19);

        System.out.printf("Hello, im %s, and i have %d yo\n", person1.getName(), person1.getAge());

        person1.setAge(20);
        person1.setName("Alexis");

        System.out.printf("Hello, im %s, and i have %d yo\n", person1.getName(), person1.getAge());

        var product1 = new Product("Chocolate", 100);
        product1.setPrice(150);
        product1.setPrice(0);

        var bankAccount = new BankAccount(1000);

        bankAccount.withdraw(500);
        bankAccount.deposit(200);

        var book1 = new Book("IT");
        System.out.println("Im reading "+book1.getTitle());

        var temperature1 = new Temperature(50);

        temperature1.setCelsius(-101);




    }
}
