package edu.upc.dsa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TracksManagerImpl implements TracksManager {
    private static TracksManager instance;
    protected List<Track> tracks;

    private TracksManagerImpl() {
        this.tracks = new LinkedList<>();
    }

    public static TracksManager getInstance() {
        if (instance==null) instance = new TracksManagerImpl();
        return instance;
    }

    public int size() {
        return this.tracks.size();
    }

    public void addTrack(Track t) {
        this.tracks.add (t);
    }

    public void addTrack(String title, String singer) {
        this.addTrack(new Track(title, singer));
    }

    public Track getTrack(int i) {
        Track t=null;
        if (i<this.tracks.size()) t = this.tracks.get(i);

        return t;
    }

    public List<Track> findAll() {
        return this.tracks;
    }

    @Override
    public void deleteTrack(int id) {
        this.tracks.remove(id);

    }

    @Override
    public void updateTrack(Track p) {
        Track t = this.getTrack(p.getId());
        t.setSinger(p.getSinger());
        t.setTitle(p.getSinger());
    }
}
