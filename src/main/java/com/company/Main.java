package com.company;

public class Main {
    public static void main(String[] args) {


        ForumUser admin = new ForumUser("Admin", "Admin", "Admin", 999, "Admin","admin");
        Menu operation = new Menu();

        operation.performAction(admin);
    }
}