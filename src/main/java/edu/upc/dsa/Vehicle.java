package edu.upc.dsa;

//Jackson Inheritance based on https://jersey.github.io/documentation/latest/media.html#json.jackson
// and http://www.baeldung.com/jackson-inheritance


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Car.class, name = "car"),
        @JsonSubTypes.Type(value = Aircraft.class, name = "aircraft")
})
public class Vehicle {
    public String id;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }
}
