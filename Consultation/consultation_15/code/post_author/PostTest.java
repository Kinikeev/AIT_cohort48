package post_author;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class PostTest {

    Author[] authors;
    Post[] posts;
    LocalDateTime currentDate = LocalDateTime.now();

    Comparator<Post> comparatorByDate = new Comparator<Post>() {
        @Override
        public int compare(Post p1, Post p2) {
            return p1.getDate().compareTo(p2.getDate());
        }
    };

    @BeforeEach
    void setUp() {
        authors = new Author[3];
        authors[0] = new Author("N1", "L3", 2002);
        authors[1] = new Author("N1", "L1", 1975);
        authors[2] = new Author("N2", "L2", 1980);

        posts = new Post[5];
        posts[0] = new Post(1, "t1", authors[0], "content 1");
        posts[0].setDate(currentDate.minusDays(10));
        posts[1] = new Post(2, "t2", authors[1], "content 2");
        posts[1].setDate(currentDate.minusDays(20));
        posts[2] = new Post(3, "t3", authors[2], "content 3");
        posts[2].setDate(currentDate.minusDays(15));
        posts[3] = new Post(4, "t4", authors[0], "content 4");
        posts[3].setDate(currentDate.minusDays(5));
        posts[4] = new Post(5, "t5", authors[1], "content 5");
        posts[4].setDate(currentDate.minusDays(1));




    }
    @Test
    void sortByAuthor(){
        printArray(posts);
        Arrays.sort(posts);
        printArray(posts);
    }
    @Test
    void getPostsByAuthor(){
        String lastName = "L1";
        Post[] res = findByPredicate(p -> p.getAuthor().getLastName().equals(lastName));
        printArray(res);
    }
    @Test
    void sortByDate(){
        printArray(posts);
        Arrays.sort(posts,comparatorByDate);
        printArray(posts);
    }
    private void printArray(Post[] posts){
        for (Post p : posts){
            System.out.println(p);
        }
        System.out.println("------------------------------------------------------------------------------------");
    }

    private Post[] findByPredicate(Predicate<Post> predicate){
        int count;
        int j = 0;
        Post[] res = new  Post[posts.length];
        for (int i = 0; i < posts.length; i++) {
            if (predicate.test(posts[i])){
                res[++j] = posts[i];  // заполняем новый массив, теми элементами, которые пройдут тест
            }
        }
        Arrays.copyOf(res,j);
        return res;
    }
}