package com.company;
import java.util.Scanner;
public class Ch315 {
    public static void displayAccount(Ch315Account accountToDisplay){
        System.out.printf("Account name: %s%nBalance: %f%n%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Ch315Account acc3 = new Ch315Account("Name Surname", 79.00);
        Ch315Account acc4 = new Ch315Account("Name surname", -90.53);

        displayAccount(acc3);
        displayAccount(acc4);
        System.out.println("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account balance%n%n",
                depositAmount);
        acc3.deposit(depositAmount);


        System.out.println("Enter amount for withdraw for acc1:");
        double withdrawAmount = input.nextDouble();
        if(withdrawAmount <= acc3.getBalance()){
            acc3.withdraw(withdrawAmount);
            System.out.println("\n Successful withdraw");
        }
        else
            System.out.println("Withdraw amount exceeded account balance");


        System.out.println("Enter amount for withdraw for acc2:");
        withdrawAmount = input.nextDouble();
        if(withdrawAmount <= acc4.getBalance()){
            acc4.withdraw(withdrawAmount);
            System.out.println("\nSuccessful withdraw");
        }
        else
            System.out.println("Withdraw amount exceeded account balance");

        displayAccount(acc3);
        displayAccount(acc4);
    }
}