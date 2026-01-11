package oop.accessModifiersExercises;

public class AccessModifiersExercises {
    public static void main(String[] args){
        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase. x
        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0. x
        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente. x
        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor. x
        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.x
        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas. x
        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos. x
        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height. x
        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60. x
        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0). x

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


        var user1 = new User("Cristobal", "1234");

        user1.checkPassword("1234");
        user1.setUsername("Cris");
        user1.setPassword("12345");
        user1.checkPassword("1234");

        var employee1 = new Employee("Cristobal", 1000);
        employee1.raiseSalary(20);

        var rectangle1 = new Rectangle(10, 9);
        rectangle1.calculateArea();
        rectangle1.setHeight(20);
        rectangle1.setWidth(10);
        rectangle1.calculateArea();

        var student1= new Student("Cristobal", 60);
        System.out.printf("%s aprobo?: %b\n", student1.name, student1.isPassed());
        student1.setGrade(59);
        System.out.printf("%s aprobo?: %b\n", student1.name, student1.isPassed());

        var car1= new Car(60);
        car1.accelerate(100);
        car1.brake(0);



    }
}
