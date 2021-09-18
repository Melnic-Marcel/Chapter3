package com.company;

import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

class Ch317HealthRecords{
    private String name;
    private String surname;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;

    public Ch317HealthRecords() {}

    public Ch317HealthRecords(String name, String surname, String gender, int day, int month, int year, double height, double weight) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge(int day, int month, int year){
        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate now = LocalDate.of(LocalDate.now().getYear(),
                LocalDate.now().getMonth(), LocalDate.now().getDayOfMonth());
        return (int) ChronoUnit.YEARS.between(birthdate, now);
    }

    public int maxHeartRate(int day, int month, int year){
        return 220 - getAge(day, month, year);
    }

    public int minTargetHeartRate(){
        return (int) (maxHeartRate(day, month, year) * 0.5);
    }

    public int maxTargetHeartRate(){
        return (int) (maxHeartRate(day, month, year) * 0.85);
    }

    public double findBMI(double height, double weight){
        return (weight) / (height * height);
    }
}
class Result extends JFrame{
    JPanel resultPanel = new JPanel();
    JLabel resultLabel = new JLabel();
    JButton OK = new JButton("OK");
    Result(){
        super("Result");
        setSize(300, 230);
        setLayout(new FlowLayout());
        resultPanel.setLayout(new FlowLayout());
        resultPanel.setSize(195,180);
        OK.addActionListener(e -> dispose());
        resultPanel.add(resultLabel);
        add(resultPanel);
        add(OK);
        setVisible(false);
        setResizable(false);
        setLocationRelativeTo(null);
    }
}