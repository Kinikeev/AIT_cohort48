package home_work_32.forum.test;

import home_work_32.forum.dao.Forum;
import home_work_32.forum.dao.ForumImpl;
import home_work_32.forum.model.Post;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class ForumImplTest {

    Forum forum;
    Post[] posts = new Post[6];
    Comparator<Post> comparator = (p1, p2) -> Integer.compare(p1.getPostId(), p2.getPostId());

    @BeforeEach
    void setUp() throws Exception {
        forum = new ForumImpl();
        posts[0] = new Post(0, "title1", "author1", "content");
        posts[1] = new Post(1, "title2", "author2", "content");
        posts[2] = new Post(2, "title3", "author2", "content");
        posts[3] = new Post(3, "title4", "author1", "content");
        posts[4] = new Post(4, "title1", "author3", "content");
        posts[5] = new Post(5, "title2", "author1", "content");
        for (int i = 0; i < posts.length - 1; i++) {
            forum.addPost(posts[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addPost() {
        assertFalse(forum.addPost(null));
        assertTrue(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
        assertFalse(forum.addPost(posts[5]));
        assertEquals(6, forum.size());
    }

    @org.junit.jupiter.api.Test
    void removePost() {
        assertTrue(forum.removePost(2));
        assertEquals(4, forum.size());
        assertFalse(forum.removePost(2));
        assertEquals(4, forum.size());
    }

    @org.junit.jupiter.api.Test
    void updatePost() {
        assertFalse(forum.updatePost(5, "new content"));
        assertTrue(forum.updatePost(1, "new content"));
        assertEquals("new content", forum.getPostById(1).getContent());

    }

    @org.junit.jupiter.api.Test
    void getPostById() {
        assertEquals(posts[3], forum.getPostById(3));
        assertNull(forum.getPostById(5));
    }

    @org.junit.jupiter.api.Test
    void testGetPostsByAuthorString() {
        Post[] actual = forum.getPostsByAuthor("author1");
        Arrays.sort(actual, comparator);
        Post[] expected = {posts[0], posts[3]};
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testGetPostsByAuthorStringLocalDateLocalDate() {
        posts[0].setDate(LocalDateTime.now().minusDays(6));
        posts[1].setDate(LocalDateTime.now().minusDays(9));
        posts[2].setDate(LocalDateTime.now().minusDays(5));
        posts[3].setDate(LocalDateTime.now().minusDays(7));
        posts[4].setDate(LocalDateTime.now().minusDays(10));
        posts[5].setDate(LocalDateTime.now().minusDays(8));
        // FIXME
        // forum.addPost(posts[5]);
        forum = new ForumImpl();
        for (int i = 0; i < posts.length; i++) {
            forum.addPost(posts[i]);
        }
        Post[] actual = forum.getPostsByAuthor("author1", LocalDate.now().minusDays(8), LocalDate.now().minusDays(7));
        Arrays.sort(actual, comparator);
        Post[] expected = {posts[3], posts[5]};
        assertArrayEquals(expected, actual);
        actual = forum.getPostsByAuthor("author1", LocalDate.now().minusDays(15), LocalDate.now().minusDays(10));
        assertEquals(0, actual.length);
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(5, forum.size());
    }

} // End of class