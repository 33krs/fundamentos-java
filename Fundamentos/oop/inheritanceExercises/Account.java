package oop.inheritanceExercises;

public class Account {
    // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un metodo addInterest().


    double balance;

    public Account(double balance){
        this.balance = balance;
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
