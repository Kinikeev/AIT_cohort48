package class_work_32.ait.album.test;

import class_work_32.ait.album.dao.Album;
import class_work_32.ait.album.dao.AlbumImpl;
import class_work_32.ait.album.model.Photo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AlbumImplTest {

    Album album;  // объект типа AlbumImpl
    private Photo[] photos;
    private int size;
    LocalDate now = LocalDate.now();

    // Comparator sort by album then by PhotoId
    Comparator<Photo> comparator = (p1,p2) -> {
        int res = Integer.compare(p1.getAlbumId(),p2.getAlbumId());
        return res != 0 ? res : Integer.compare(p1.getPhotoId(),p2.getPhotoId());
    };

    @BeforeEach
    void setUp() {
        // fill array of photos
        album = new AlbumImpl(7);
        photos = new Photo[6];
        photos[0] = new Photo(1, 1, "title1", "url1", now.minusDays(7));
        photos[1] = new Photo(1, 2, "title2", "url2", now.minusDays(7));
        photos[2] = new Photo(1, 3, "title3", "url3", now.minusDays(5));
        photos[3] = new Photo(2, 1, "title1", "url1", now.minusDays(7));
        photos[4] = new Photo(2, 4, "title4", "url4", now.minusDays(2));
        photos[5] = new Photo(1, 4, "title4", "url1", now.minusDays(2));

        for (int i = 0; i < photos.length; i++) {
            album.addPhoto(photos[i]);
        }
    }

    @Test
    void addPhoto() {
        // boolean addPhoto(Photo photo)
        Photo photo = new Photo(1,5,"tittle5","url5",now.minusDays(2));
        assertTrue(album.addPhoto(photo));
        assertFalse(album.addPhoto(null));
        assertFalse(album.addPhoto(photos[1]));
        assertEquals(7, album.size());
        photo = new Photo(2, 6, "title6", "url6", now.minusDays(2));
        assertFalse(album.addPhoto(photo));

    }

    @Test
    // boolean removePhoto(int albumId, int photoId)
    void removePhoto() {
        album.printArray(photos); // before remove
        assertEquals(6,album.size());
        // remove existed photo
        assertTrue(album.removePhoto(1, 1));
        // remove absent photo
        assertFalse(album.removePhoto(1, 7));
        assertEquals(5, album.size());
        album.printArray(photos); // after remove
    }

    @Test
    void updatePhoto() {
        assertTrue(album.updatePhoto(1, 1, "newUrl"));
        assertEquals("newUrl", album.getPhotoFromAlbum(1, 1).getUrl());
        album.printArray(photos);
    }

    @Test
    void getPhotoFromAlbum() {
        // get existed photo
        assertEquals(photos[0],album.getPhotoFromAlbum(1,1));
        // get absent photo
        assertNull (album.getPhotoFromAlbum(1,5));


    }

    @Test
    void getAllPhotosFromAlbum() {
        Photo[] expected = {photos[3], photos[4]};
        Photo[] actual = album.getAllPhotosFromAlbum(2);
        assertArrayEquals(expected, actual);
        album.printArray(expected);
        album.printArray(actual);
    }

    @Test
    void getPhotosBetweenDate() {
        LocalDate localDate = LocalDate.now();
        Photo[] expected = {photos[2], photos[4], photos[5]};
        Arrays.sort(expected, comparator);
        Photo[] actual = album.getPhotosBetweenDate(localDate.minusDays(5), localDate.minusDays(2));
        Arrays.sort(actual, comparator);
        assertArrayEquals(expected, actual);
        album.printArray(actual);
    }

    @Test
    void size() {
        assertEquals(6,album.size());
        album.removePhoto(1,1);
        assertEquals(5,album.size());
    }

    @Test
    void printArray() {
        album.printArray(photos);
    }
}