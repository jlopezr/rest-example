package edu.upc.dsa;

public class Track {

    int id;
    String title;
    String singer;
    static int lastId;

    public Track() {
        this.setId(lastId++);
    }

    public Track(String title, String singer) {
        this();
        this.setSinger(singer);
        this.setTitle(title);
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id=id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", singer=" + singer +"]";
    }

}