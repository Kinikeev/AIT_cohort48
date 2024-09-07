package home_work_32.forum.dao;

import class_work_32.ait.album.model.Photo;
import home_work_32.forum.model.Post;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Predicate;

public class ForumImpl implements Forum {

    private static final int INITIAL_CAPACITY = 10;
    private Post[] posts = new Post[INITIAL_CAPACITY];
    private int size;

    // comparator sort by Author
    private Comparator<Post> comparator = (p1, p2) -> {
        int res = p1.getAuthor().compareTo(p2.getAuthor());
        res = res != 0 ? res : p1.getDate().compareTo(p2.getDate());
        return res != 0 ? res : Integer.compare(p1.getPostId(), p2.getPostId());
    };

    @Override
    public boolean addPost(Post post) {
        if (post == null || getPostById(post.getPostId()) != null){
            return false;
        }
        if (size == posts.length) {
            posts = Arrays.copyOf(posts, posts.length << 1); // what's doing here?
        }
        // находим место расположения post в массиве, сортируемый comparator-ом.
        int index = Arrays.binarySearch(posts,0,size,post,comparator);
        index = index >= 0 ? index : -index-1;

        // расширяем массив и готовим дополнительное место для внесения post согласно его (index) места расположения.
        System.arraycopy(posts,index,posts,index+1,size-index);

        // вносим post в массив(posts) согласно его (index) места расположения
        posts[index] = post;
        size++;
        return true;
    }

    @Override
    public boolean removePost(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId){
                System.arraycopy(posts,i+1,posts,i,size-i-1);
                posts[--size]= null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePost(int postId, String content) {
        Post post = getPostById(postId);
        if (post == null) {
            return false;
        }
        post.setContent(content);
        return true;
    }

    @Override
    public Post getPostById(int postId) {
        for (int i = 0; i < size; i++) {
            if (posts[i].getPostId() == postId){
                return posts[i];
            }
        }
        return null;
    }

    @Override
    public Post[] getPostsByAuthor(String author) {
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MIN);
        int from = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.MAX);
        int to = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override
    public Post[] getPostsByAuthor(String author, LocalDate dateFrom, LocalDate dateTo) {
        Post pattern = new Post(Integer.MIN_VALUE, null, author, null);
        pattern.setDate(dateFrom.atStartOfDay());
        int from = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        pattern = new Post(Integer.MAX_VALUE, null, author, null);
        pattern.setDate(LocalDateTime.of(dateTo, LocalTime.MAX));
        int to = -Arrays.binarySearch(posts, 0, size, pattern, comparator) - 1;
        return Arrays.copyOfRange(posts, from, to);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printArray(Post[] array) {
        for (Post p : posts) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------------------------------------------------");
    }

    // Predicate - основывать на фактах
    private Post[] findPostsByPredicate(Predicate<Post> predicate){
        Post[] res = new Post[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(posts[i])){
                res[j++] = posts[i];  // заполняем новый массив, теми элементами, которые пройдут тест
            }
        }
        return Arrays.copyOf(res,j);
    }
} // End of class
