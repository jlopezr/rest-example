package edu.upc.dsa;

import edu.upc.dsa.models.Track;

import java.util.List;

public interface TracksManager {


    public Track addTrack(String title, String singer);
    public Track addTrack(Track t);
    public Track getTrack(String id);
    public List<Track> findAll();
    public void deleteTrack(String id);
    public Track updateTrack(Track t);

    public int size();
}
