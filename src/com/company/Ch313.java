package com.company;
public class Ch313 {
    public static void main(String[] args) {
        Ch313Employee emp1 = new Ch313Employee("Constantin", "Starosta", 400);
        Ch313Employee emp2 = new Ch313Employee("Alexandru", "Djundiet", 500);

        System.out.printf("%n%s have yearly salary: %.2f", emp1.getFirstName(), emp1.getSalary() * 12);
        System.out.printf("%n%s have yearly salary: %.2f%n", emp2.getFirstName(), emp2.getSalary() * 12);
        System.out.printf("%n%s have yearly salary: %.2f", emp1.getFirstName(), emp1.raiseSalary(emp1.getSalary()) * 12);
        System.out.printf("%n%s have yearly salary: %.2f", emp2.getFirstName(), emp2.raiseSalary(emp2.getSalary()) * 12);
    }
}