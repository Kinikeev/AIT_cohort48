package class_work_32.ait.album.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Photo {

    private int albumId;
    private int photoId;
    private String tittle;
    private String url;
    private LocalDateTime date;

    public Photo(int albumId, int photoId, String tittle, String url, LocalDateTime date) {
        this.albumId = albumId;
        this.photoId = photoId;
        this.tittle = tittle;
        this.url = url;
        this.date = date;
    }

    // getters
    public int getAlbumId() {
        return albumId;
    }
    public int getPhotoId() {
        return photoId;
    }
    public String getTittle() {
        return tittle;
    }
    public String getUrl() {
        return url;
    }
    public LocalDateTime getDate() {
        return date;
    }

    // setters
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Photo{");
        sb.append("albumId=").append(albumId);
        sb.append(", photoId=").append(photoId);
        sb.append(", tittle='").append(tittle).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo photo)) return false;
        return albumId == photo.albumId && photoId == photo.photoId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, photoId);
    }
}
