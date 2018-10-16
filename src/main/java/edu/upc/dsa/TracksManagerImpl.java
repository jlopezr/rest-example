package edu.upc.dsa;

import java.util.ArrayList;
import java.util.List;

public class TracksManagerImpl implements TracksManager {
    private static TracksManager instance;
    List<Track> tracks;

    private TracksManagerImpl() {
        this.tracks = new ArrayList<Track>();
    }

    public static TracksManager getInstance() {
        if (instance==null) instance = new TracksManagerImpl();
        return instance;
    }

    public void addTrack(Track t) {
        this.tracks.add (t);
    }

    public void addTrack(String title, String singer) {
        this.addTrack(title, singer);
    }

    public Track getTrack(int i) {
        return this.tracks.get(i);
    }

    public List<Track> findAll() {
        return this.tracks;
    }
}
