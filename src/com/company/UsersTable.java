package com.company;

public class UsersTable {
    User[] usersArray = new User[100];
    public void addUser(String firstName, String lastName, int age, int historyOfLoans, String comment)
    {
        for(int i = 0; i < usersArray.length; ++i)
        {
            if(usersArray[i] == null)
            {
                usersArray[i] = new User(i,firstName,lastName,age,historyOfLoans, comment);
                return;
            }
        }
    }
    public void printInfo(int id)
    {
        System.out.println(usersArray[id].firstName + " " + usersArray[id].lastName);
    }
}
