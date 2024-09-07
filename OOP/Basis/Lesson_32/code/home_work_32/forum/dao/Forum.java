package home_work_32.forum.dao;

import home_work_32.forum.model.Post;

import java.time.LocalDate;

public interface Forum {

    boolean addPost(Post post);
    boolean removePost(int postId);
    boolean updatePost(int postId,String content);
    Post getPostById(int postId);
    Post[] getPostsByAuthor(String author);
    Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo);
    int size();
    void printArray(Post[] array);

} // End of interface

