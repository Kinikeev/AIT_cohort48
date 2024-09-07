package post_author;

import java.time.LocalDateTime;
import java.util.Objects;

public class Post implements Comparable<Post>{
    private int id;
    private String title;
    private Author author;  // связывание классов
    private String content;
    private LocalDateTime date;
    private int likes;

    public Post(int id, String title, Author author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public int addLike(){
        return likes++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Post post)) return false;
        return id == post.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Post{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author=").append(author);
        sb.append(", content='").append(content).append('\'');
        sb.append(", date=").append(date);
        sb.append(", likes=").append(likes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Post o) {
        return this.author.getLastName().compareTo(o.author.getLastName());
    }
}
