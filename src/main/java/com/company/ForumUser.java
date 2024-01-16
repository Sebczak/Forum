package com.company;

import java.util.*;

class ForumUser extends User {

    private String userName;
    private boolean isUserLogged = false;
    private final String newline = "\n";

    public Set<Post> posts = new LinkedHashSet<>();

    Scanner scanner = new Scanner(System.in);

    public ForumUser(String userFirstName, String userLastName, String userGender, int userAge, String userEmail, String userName) {

        super(userFirstName, userLastName, userGender, userAge, userEmail);
        this.userName = userName;
    }

    public ForumUser createUser() {
        System.out.print("Podaj imię: ");
        String firstName = scanner.next();
        System.out.print("Podaj nazwisko: ");
        String lastName = scanner.next();
        System.out.print("Podaj swoja plec: ");
        String gender = scanner.next();
        System.out.print("Podaj swoj wiek: ");
        int age = scanner.nextInt();
        System.out.print("Podaj swoj email: ");
        String email = scanner.next();
        System.out.print("Podaj swoj username: ");
        String username = scanner.next();
        return new ForumUser(firstName, lastName, gender, age, email,username);
    }

    public void userData() {

        isUserLogged = true;
            System.out.print(
                    "Zalogowano użytkownika " + getUserName() + newline
                            + "Nazwa użytkownika: " + getUserName() + newline
                            + "Dane podstawowe: " + newline + getUserFirstName()
                            + " " + getUserLastName() + newline
                            + "Płeć: " + getUserGender() + newline
                            + "Wiek: " + getUserAge() + newline
                            + "Adres Email: " + getUserEmail() + newline
                            + "Ilość postów na platformie: " + posts.size() + newline
            );
        }

        public void userLogin() {
            isUserLogged = !isUserLogged;
        }

    public ForumUser searchUserByUsername(List<ForumUser> listOfUsers, String usernameToSearch) {
        for (ForumUser user : listOfUsers) {
            if (user.getUserName().equals(usernameToSearch)) {
                return user;
            }
        }
        return null; // Return null if the user is not found
    }

    public boolean deleteUserAccount(List<ForumUser> listOfUsers, String usernameToDelete, String userName) {
        ForumUser userToDelete = searchUserByUsername(listOfUsers, usernameToDelete);

        if(userToDelete != null && userToDelete.getUserName().equals(userName)) {
            listOfUsers.remove(userToDelete);
            System.out.println("Uzytkownik:" + usernameToDelete + " zostal usuniety.");
            return true;
        } else if (userToDelete != null && !userToDelete.getUserName().equals(userName)) {
            System.out.println("Podales nie swoja nazwe uzytkownika.");
        } else {
            System.out.println("Uzytkownik o takiej nazwie: " + usernameToDelete + " nie istnieje.");
        }
        return false;
    }

        @Override
        public String toString() {
            return
                    "Stworzono użytkownika " + getUserName() + newline
                            + "Nazwa użytkownika: " + getUserName() + newline
                            + "Dane podstawowe: " + newline + getUserFirstName()
                            + " " + getUserLastName() + newline
                            + "Płeć: " + getUserGender() + newline
                            + "Wiek: " + getUserAge() + newline
                            + "Adres Email: " + getUserEmail() + newline
                            + "Ilość postów na platformie: " + posts.size() + newline;
        }


    public String getUserName() {

        return this.userName;
    }

    public int getAmountOfPosts() {

        return this.posts.size();
    }
}
