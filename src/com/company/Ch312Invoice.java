package com.company;

public class Ch312Invoice {
    public static void main(String[] args) {
        Ch312InvoiceTest inv1 = new Ch312InvoiceTest("23214", "HDD", 1, 22.5);
        Ch312InvoiceTest inv2 = new Ch312InvoiceTest("23215", "SSD", 4, 11.2);
        Ch312InvoiceTest inv3 = new Ch312InvoiceTest("23216", "CPU", 0, -4.8);
        Ch312InvoiceTest inv4 = new Ch312InvoiceTest("23217", "Flash", 2, 9.5);

        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv1.getNumber(), inv1.getDescription(), inv1.getQuantity(), inv1.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv2.getNumber(), inv2.getDescription(), inv2.getQuantity(), inv2.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv3.getNumber(), inv3.getDescription(), inv3.getQuantity(), inv3.getPrice());
        System.out.printf("%nNo %s contain %s, quantity %d on price %.2f",
                inv4.getNumber(), inv4.getDescription(), inv4.getQuantity(), inv4.getPrice());
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv1.getNumber(), inv1.getInvoiceAmount(inv1.getQuantity(), inv1.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv2.getNumber(), inv2.getInvoiceAmount(inv2.getQuantity(), inv2.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv3.getNumber(), inv3.getInvoiceAmount(inv3.getQuantity(), inv3.getPrice()));
        System.out.printf("%nTotal price of invoice %s: $%.2f",
                inv4.getNumber(), inv4.getInvoiceAmount(inv4.getQuantity(), inv4.getPrice()));


    }
}