package class_work_32.ait.album.dao;

import class_work_32.ait.album.model.Photo;

import java.time.LocalDate;


public interface Album {

    boolean addPhoto(Photo photo);
    boolean removePhoto(int albumId,int photoId);
    boolean updatePhoto(int albumId,int photoId,String url);
    Photo getPhotoFromAlbum(int albumId,int photoId);
    Photo[] getAllPhotosFromAlbum(int albumId);
    Photo[] getPhotosBetweenDate(LocalDate dateFrom, LocalDate dateTo);
    int size();
    void printArray(Photo[] array);
}
