package com.company.Controller;

import com.company.Model.ForumUser;
import com.company.Repository.ForumUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    ForumUserRepo forumUserRepo;

    private List<ForumUser> listOfUsers = new ArrayList<>();

    @GetMapping("/getUsers")
    public ResponseEntity<List<ForumUser>> getUsers() {
        List<ForumUser> usersFromDatabase = forumUserRepo.findAll();
        listOfUsers.clear();
        listOfUsers.addAll(usersFromDatabase);
        return new ResponseEntity<>(listOfUsers, HttpStatus.OK);
    }

    @PostMapping("/addForumUser")
    public void addForumUser(@RequestBody ForumUser forumUser) {
        System.out.println("Received ForumUser: " + forumUser);
        forumUserRepo.save(forumUser);
        listOfUsers.add(forumUser);

    }
}
