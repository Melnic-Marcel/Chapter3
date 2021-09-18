package com.company;
import java.util.Scanner;
public class Ch316 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Ch316HeartRates person1;
        person1 = new Ch316HeartRates();
        System.out.println("Insert your: \nName: ");
        person1.setName(input.nextLine());
        System.out.println("Surname: ");
        person1.setSurname(input.nextLine());
        System.out.println("Day of birth: ");
        person1.setDay(input.nextInt());
        System.out.println("Month of birth: ");
        person1.setMonth(input.nextInt());
        System.out.println("Year of birth: ");
        person1.setYear(input.nextInt());
        System.out.printf("Years: %d%n", person1.personAge(person1.getDay(), person1.getMonth(), person1.getYear()));
        System.out.printf("Maxim Heart Rates: %d%n", person1.maxHeartRate());
        System.out.printf("Target Heart Rates: Between %d and %d%n",person1.minTargetHeartRate(), person1.maxTargetHeartRate());
    }
}