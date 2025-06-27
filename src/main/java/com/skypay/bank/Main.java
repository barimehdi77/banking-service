package com.skypay.bank;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AccountService account = new Account();

        account.deposit(1000);
        account.deposit(2000);
        account.withdraw(500);
        account.withdraw(1000);
        account.withdraw(1000);
//        account.withdraw(1000); // this will throw an error "Insufficient funds"

        account.printStatement();
    }
}