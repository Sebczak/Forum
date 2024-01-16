package com.company;

import java.util.*;

public class PostStorage {

    private Map<Integer, Post> posts;
    private int postCounter;
    Scanner scanner = new Scanner(System.in);

    public PostStorage() {
        this.posts = new HashMap<>();
        this.postCounter = 1;
    }

    public Post createPost(String author) {
        System.out.print("Podaj Tytul posta: ");
        String postTitle = scanner.nextLine();
        System.out.print("Opisz temat: ");
        String postContent = scanner.nextLine();

        int postId = postCounter++;
        return new Post(postId, postTitle, postContent, author);
    }

    public Set<Post> movePostToSet(Post post, Set<Post> listOfPosts) {
        for(Post p : posts.values()) {
            if(p.getPostAuthor().equals(post.getPostAuthor())) {
                listOfPosts.add(p);
            }
        }
        return listOfPosts;
    }

    public void addPost(Post post) {
        posts.put(post.getPostId(),post);
    }

    public Post getPostByIndex(int index) {
        for (Map.Entry<Integer, Post> entry : posts.entrySet()) {
            if (entry.getKey() == index) {
                return entry.getValue();
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PostStorage that = (PostStorage) o;
        return Objects.equals(posts, that.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(posts);
    }

    @Override
    public String toString() {
        return "PostStorage{" +
                "Posts=" + posts +
                '}';
    }
    
    public Map<Integer, Post> getPosts() {
        return posts;
    }
}
