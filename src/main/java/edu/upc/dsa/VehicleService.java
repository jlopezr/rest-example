package edu.upc.dsa;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/vehicles")
public class VehicleService {

    @GET
    @Path("/getAll")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vehicle> getAllVehicles() {
        List<Vehicle> list = new ArrayList<Vehicle>();
        Car c = new Car();
        c.setId("S-1243-XB");
        c.manufacturer = "Seat";
        c.model = "Ibiza";
        Aircraft a = new Aircraft();
        a.setId("EC-EPL");
        a.setNumberOfPassengers(180);
        list.add(c);
        list.add(a);

        return list;
    }
}
