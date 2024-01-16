package com.company;

class User {

    private String userFirstName;
    private String userLastName;
    private String userGender;
    private int userAge;
    private String userEmail;

    public User(String userFirstName, String userLastName, String userGender, int userAge, String userEmail) {

        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userGender = userGender;
        this.userAge = userAge;
        this.userEmail = userEmail;
    }

    public String getUserFirstName() {
        return this.userFirstName;
    }

    public String getUserLastName() {
        return this.userLastName;
    }

    public String getUserGender() {
        return this.userGender;
    }

    public int getUserAge() {
        return this.userAge;
    }

    public String getUserEmail() {
        return this.userEmail;
    }
}
