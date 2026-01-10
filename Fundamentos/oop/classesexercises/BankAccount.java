package oop.classesexercises;

public class BankAccount {
    // 6. Crea una clase BankAccount con atributo balance y un metodo deposit() que sume el saldo.

    double balance;



    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Su nuevo balance es de: "+balance);
    }

}
