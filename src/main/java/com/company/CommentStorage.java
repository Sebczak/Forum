package com.company;

import java.util.*;
public class CommentStorage {

    private Map<Post, List<Comment>> comments;

    private Scanner scanner = new Scanner(System.in);

    public CommentStorage() {
        this.comments = new HashMap<>();
    }

    public Comment addCommentToPost(Post post, String author) {

        System.out.print("Podaj tresc komentarza: ");
        String commentText = scanner.nextLine();
        Comment newComment = new Comment(commentText, author);

        post.addComment(newComment);

        List<Comment> postComment = comments.getOrDefault(post, new ArrayList<>());
        postComment.add(newComment);
        comments.put(post, postComment);
        return newComment;
    }

    public Map<Post, List<Comment>> getComments() {
        return comments;
    }
}
