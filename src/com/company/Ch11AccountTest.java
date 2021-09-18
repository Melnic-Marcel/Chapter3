package com.company;

import javax.swing.JOptionPane;

public class Ch11AccountTest {
    public static void main(String[] args){

        double depositAmount;
        double withdrawlAmount;

        Ch11Account ch11Account1 = new Ch11Account(50.00);
        Ch11Account ch11Account2 = new Ch11Account(-7.53);

        showBalance(ch11Account1.getBalance(), ch11Account2.getBalance());

        depositAmount = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter deposit amount for account1: "
        ));

        showProgress("adding", "account1", depositAmount);

        ch11Account1.credit(depositAmount);

        showBalance(ch11Account1.getBalance(), ch11Account2.getBalance());

        depositAmount = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter deposit amount for account2: "
        ));

        showProgress("adding", "account2", depositAmount);

        ch11Account2.credit(depositAmount);

        showBalance(ch11Account1.getBalance(), ch11Account2.getBalance());

        withdrawlAmount = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter withdrawl amount for account1: "
        ));

        if(ch11Account1.debit(withdrawlAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(ch11Account1.getBalance(), ch11Account2.getBalance());

        withdrawlAmount = Double.parseDouble(JOptionPane.showInputDialog(
                "Enter withdrawl amount for account2: "
        ));

        if(ch11Account2.debit(withdrawlAmount) != true){
            JOptionPane.showMessageDialog(null, "Debit amount exceeded account balance");
        }
        showBalance(ch11Account1.getBalance(), ch11Account2.getBalance());
    }

    static private void showBalance(double balance1, double balance2){

        String strBalance = String.format(
                "account1 balance: $%.2f\naccount2 balance: $%.2f",
                balance1, balance2
        );
        JOptionPane.showMessageDialog(null, strBalance);
    }

    static private void showProgress(String action, String account, double amount){
        String strProgress = String.format(
                "%s $%.2f to %s balance...", action, amount, account);
        JOptionPane.showMessageDialog(null, strProgress);
    }
}