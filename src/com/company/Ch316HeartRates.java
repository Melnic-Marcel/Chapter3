package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Ch316HeartRates{
    private String name;
    private String surname;
    private int month;
    private int day;
    private int year;

    public Ch316HeartRates(){}
    public Ch316HeartRates(String name, String surname, int month, int day, int year) {
        this.name = name;
        this.surname = surname;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int personAge(int day, int month, int year){
        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.of(LocalDate.now().getYear(),
                LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        return (int) ChronoUnit.YEARS.between(birthdate, now);
    }

    public int maxHeartRate(){
        return 220 - personAge(day, month, year);
    }

    public int minTargetHeartRate(){
        return (int) (maxHeartRate() * 0.5);
    }

    public int maxTargetHeartRate(){
        return (int) (maxHeartRate() * 0.85);
    }
}