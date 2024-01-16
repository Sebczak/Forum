package com.company;

import java.util.*;
public class PostCommentViewer {
    private Scanner scanner = new Scanner(System.in);
    private PostStorage postStorage;
    private CommentStorage commentStorage;

    public PostCommentViewer(PostStorage postStorage, CommentStorage commentStorage) {
        this.postStorage = postStorage;
        this.commentStorage = commentStorage;
    }

    public void viewPostsAndComments(ForumUser user) {
        System.out.println("Lista wszystkich Postow");
        for (Map.Entry<Integer, Post> entry : postStorage.getPosts().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("Podaj index posta, do którego chcesz dodać komentarz: ");
        int postIndex = scanner.nextInt();

        Post selectedPost = postStorage.getPostByIndex(postIndex);

        if (selectedPost != null) {
            Comment newComment = commentStorage.addCommentToPost(selectedPost, user.getUserName());
            System.out.println("Dodano komentarz do posta " + postIndex + ": " + newComment);

            // Print the post details
            System.out.println(selectedPost);

            // Print comments for the selected post
            List<Comment> postComments = commentStorage.getComments().get(selectedPost);
            if (postComments != null && !postComments.isEmpty()) {
                System.out.println("Komentarze:");
                for (Comment comment : postComments) {
                    System.out.println(comment);
                }
            } else {
                System.out.println("Brak komentarzy do tego posta.");
            }
        } else {
            System.out.println("Post o podanym indeksie nie istnieje.");
        }
    }

    public void displayPostWithComments() {
        System.out.println("Lista wszystkich Postow");
        for (Map.Entry<Integer, Post> entry : postStorage.getPosts().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.print("Podaj index posta, do którego chcesz zobaczyć komentarze: ");
        int postIndex = scanner.nextInt();

        Post selectedPost = postStorage.getPostByIndex(postIndex);

        if (selectedPost != null) {
            System.out.println(selectedPost);

            List<Comment> postComments = commentStorage.getComments().getOrDefault(selectedPost, Collections.emptyList());

            if (!postComments.isEmpty()) {
                System.out.println("Komentarze:");
                for (Comment comment : postComments) {
                    System.out.println(comment);
                }
            } else {
                System.out.println("Brak komentarzy do tego posta.");
            }
        } else {
            System.out.println("Post o podanym indeksie nie istnieje.");
        }
    }
}