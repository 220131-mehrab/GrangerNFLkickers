package com.github.grangercarty.kicker;

public class Kicker {
    String lastName;
    String firstName;

    public Kicker(String rawKicker) {
        String ln = rawKicker.split(",")[1];
        String fn = rawKicker.split(",")[2];
        this.lastName = ln.substring(1);
        this.firstName = fn.substring(1,fn.length()-1);
    }

    public void printName() {
        if ( ! lastName.isEmpty() ) {
            System.out.println(firstName + " " + lastName);
        }
    }
}
