package oop.accessModifiersExercises;

public class BankAccount {
    // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount)
    // que validen las cantidades correctamente.

    private double  balance;

    public BankAccount(double balance){
        this.balance=balance;

    }

    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Dinero depositado con exito, su nuevo balance es de: "+balance+"$");
        }else System.out.println("Cantidad insuficiente de dinero para depositar. ");
    }

    public void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Cantidad insuficiente de dinero para retirar");
        }else if(amount > balance){
            System.out.println("No tienes esa cantidad de dinero");
        }else{
            balance = balance - amount;
            System.out.printf("%.1f$ retirado de tu cuenta, tu nuevo saldo es de %.1f$\n", amount, balance);
        }
    }



}
