package com.company;

import java.util.*;
public class Post {

    private String postTitle;
    private String postContent;
    private String postAuthor;
    private int postId;
    private List<Comment> comments;

    public Post(int postId, String postTitle, String postContent, String postAuthor) {
        this.postId = postId;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postAuthor = postAuthor;
    }

    public void addComment(Comment comment) {
        if(comments == null) {
            comments = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        return
                "Post nr: " + getPostId() + " " +
                        "Tytul Posta:" + getPostTitle() + " " +
                        "Opis Posta:" + getPostContent() + " " +
                        "Author Posta:" + getPostAuthor() + " ";
    }

    public int getPostId() {
        return postId;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public String getPostContent() {
        return postContent;
    }

    public String getPostAuthor() {
        return postAuthor;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
