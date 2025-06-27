package com.skypay.bank;

import java.time.LocalDate;

public class Transaction {
    private final LocalDate date;
    private final int amount;
    private final int balance;

    public Transaction(LocalDate date, int amount, int balance) {
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public String getDate() {
        return date.format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public int getAmount() { return amount; }
    public int getBalance() { return balance; }
}