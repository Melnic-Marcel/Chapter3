package com.company;

import java.util.Scanner;

class Ch315Account {
    private String name;
    private double balance;

    public Ch315Account(String name, double balance) {
        this.name = name;
        if(balance > 0.0)
            this.balance = balance;
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            balance += depositAmount;
    }
    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0.0)
            balance -= withdrawAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }
}