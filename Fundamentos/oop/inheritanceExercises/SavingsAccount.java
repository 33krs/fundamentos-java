package oop.inheritanceExercises;

public class SavingsAccount extends Account{
    // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un metodo addInterest().

    public SavingsAccount(double balance){
        super(balance);
    }

    public void addInterest(int interest){
        double interestPercentage = interest/(double)100;
        double interestDeposit = this.balance * interestPercentage;
        super.deposit(interestDeposit);
    }


}
