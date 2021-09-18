package com.company;

public class Ch314 {
    public static void main(String[] args) {
        Ch314Date14 d1 = new Ch314Date14(7,2,2109);
        Ch314Date14 d2 = new Ch314Date14(5,21, 2007);

        d1.displayDate(d1.getMonth(), d1.getDay(), d1.getYear());
        d2.displayDate(d2.getMonth(), d2.getDay(), d2.getYear());
    }
}