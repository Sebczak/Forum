package com.company;

public class Comment {
    private String comment;
    private String commentAuthor;
    public Comment(String comment, String commentAuthor) {
        this.comment = comment;
        this.commentAuthor = commentAuthor;
    }

    @Override
    public String toString() {
        return
                "Komentarz: " + getComment() + " " +
                "Autor komentarza: " + getCommentAuthor() + " ";
    }

    public String getComment() {
        return comment;
    }

    public String getCommentAuthor() {
        return commentAuthor;
    }
}
