package class_work_32.ait.album.dao;

import class_work_32.ait.album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album{

    // хранилище (repository) - fields
    private Photo[] photos;
    private int size;

    // constructor
    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        //this.size = size;
    }

    // Comparator sort by albumId then by photoId
    Comparator<Photo> comparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return res != 0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };

    @Override
    public boolean addPhoto(Photo photo) {
        if (photo == null || size == photos.length ||
                getPhotoFromAlbum(photo.getAlbumId(), photo.getPhotoId()) != null){
            return false;
        }
        // находим место расположения фото в массиве, сортируемый comparator-ом.
        int index = Arrays.binarySearch(photos,0,size,photo,comparator);
        index = index >= 0 ? index : -index-1;

        // расширяем массив и готовим дополнительное место для внесения фото согласно его (index) места расположения.
        System.arraycopy(photos,index,photos,index+1,size-index);

        // вносим фото в массив(photos) согласно его (index) места расположения
        photos[index] = photo;
        size++;
        // printArray(photos);
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                System.arraycopy(photos,i+1,photos,i,size-i-1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url) {
        Photo photo = getPhotoFromAlbum(albumId,photoId);
        if (photo == null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }

    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId) {
        for (int i = 0; i < size; i++) {
            if (photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                return photos[i];
            }
        }
        return null;
    }

    @Override
    public Photo[] getAllPhotosFromAlbum(int albumId) {
        return findPhotosByPredicate(photo -> photo.getAlbumId() == albumId);
    }

    @Override
    public Photo[] getPhotosBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        return findPhotosByPredicate(photo -> photo.getDate().isAfter(dateFrom.minusDays(1)) &&
                 photo.getDate().isBefore(dateTo.plusDays(1)));
    }

    @Override
    public int size() {
        return size;
    }

    // Predicate - основывать на фактах
    private Photo[] findPhotosByPredicate(Predicate<Photo> predicate){
        Photo[] res = new Photo[size];
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (predicate.test(photos[i])){
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res,j);
    }

    @Override
    public void printArray(Photo[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

} // End of class
