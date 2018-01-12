package com.company;

public class User {
    int id;
    String firstName;
    String lastName;
    int age;
    int historyOfLoans;
    String comment;
    User(int id, String firstName, String lastName, int age, int historyOfLoans, String comment)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.historyOfLoans = historyOfLoans;
        this.comment = comment;
    }
    public String  getName()
    {
        return firstName.concat(" " + lastName);
    }
}
