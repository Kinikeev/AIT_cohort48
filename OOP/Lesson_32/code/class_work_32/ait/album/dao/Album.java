package class_work_32.ait.album.dao;

import class_work_32.ait.album.model.Photo;

import java.time.LocalDate;

public interface Album {

    boolean addPhoto(Photo photo);
    boolean removePhoto(int photoId,int albumId);
    boolean updatePhoto(int photoId,int albumId,String url);
    Photo getPhotoFromAlbum(int photoId,int albumId);
    Photo[] getAllPhotoFromAlbum(int albumId);
    Photo[] getPhotoBeetwenDate(LocalDate dateFrom,LocalDate dateTo);
}
