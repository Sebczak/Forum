package com.company.Model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "forumUser")
@NoArgsConstructor
@AllArgsConstructor
public class ForumUser {

    @Id
    private ObjectId _id;
    private String username;
    private String userFirstName;
    private String userLastName;
    private String userGender;
    private int userAge;
    private String userEmail;

    public String getUsername() {
        return username;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserGender() {
        return userGender;
    }

    public int getUserAge() {
        return userAge;
    }

    public String getUserEmail() {
        return userEmail;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "username='" + getUsername() + '\'' +
                ", userFirstName='" + getUserFirstName() + '\'' +
                ", userLastName='" + getUserLastName() + '\'' +
                ", userGender='" + getUserGender() + '\'' +
                ", userAge=" + getUserAge() +
                ", userEmail='" + getUserEmail() + '\'' +
                '}';
    }
}
