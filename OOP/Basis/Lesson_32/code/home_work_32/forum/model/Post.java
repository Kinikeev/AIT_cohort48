package home_work_32.forum.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post implements Comparable<Post> {

    // fields
    private int postId;
    private String title;
    private String author;
    private String content;
    private LocalDateTime date;
    private int likes;

    // constructor
    public Post(int postId, String title, String author, String content) {
        this.postId = postId;
        this.title = title;
        this.author = author;
        this.content = content;
        date = LocalDateTime.now();
    }

    // getters
    public int getPostId() {
        return postId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public int getLike() {
        return likes;
    }

    // setters
    public void setContent(String content) {
        this.content = content;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public int addLike() {
        return ++likes;
    }
    public int removeLike() {
        return --likes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Post{");
        sb.append("postId: ").append(postId);
        sb.append(", title: '").append(title).append('\'');
        sb.append(", author: '").append(author).append('\'');
        sb.append(", content: '").append(content).append('\'');
        sb.append(", date: ").append(date);
        sb.append(", likes: ").append(likes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return postId == post.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(postId);
    }

    @Override
    public int compareTo(Post p) {
        return this.getAuthor().compareTo(p.getAuthor());
    }
} // End of class
