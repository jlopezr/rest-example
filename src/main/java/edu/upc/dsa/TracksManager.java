package edu.upc.dsa;

import java.util.List;

public interface TracksManager {

    public void addTrack(String title, String singer);
    public void addTrack(Track t);
    public Track getTrack(int i);
    public List<Track> findAll();
    public void deleteTrack(int id);
    public void updateTrack(Track t);

    public int size();
}
