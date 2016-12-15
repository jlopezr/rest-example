package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/json")
public class JSONService {

    protected List<Track> tracks;

    public JSONService() {
        tracks = new ArrayList<>();

        Track t1 = new Track();
        t1.setTitle("Enter Sandman");
        t1.setSinger("Metallica");
        tracks.add(t1);

        Track t2 = new Track();
        t2.setTitle("La Barbacoa");
        t2.setSinger("Georgie Dann");
        tracks.add(t2);
    }

    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrack(@PathParam("id") int id) {
        return tracks.get(id);
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Track getTrackInJSON() {

        Track track = new Track();
        track.setTitle("Enter Sandman");
        track.setSinger("Metallica");

        return track;

    }

    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(Track track) {
        tracks.add(track);
        // Atencion: siempre añade en la misma posicion por el scope de tracks
        return Response.status(201).entity("Track added in position "+tracks.size()).build();
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createTrackInJSON(Track track) {

        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();
    }

}