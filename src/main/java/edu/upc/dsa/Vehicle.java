package edu.upc.dsa;

//JAXB Inheritance based on https://wiki.eclipse.org/EclipseLink/Examples/MOXy/ObjectGraphs/Metadata

import org.eclipse.persistence.oxm.annotations.XmlNamedAttributeNode;
import org.eclipse.persistence.oxm.annotations.XmlNamedObjectGraph;
import org.eclipse.persistence.oxm.annotations.XmlNamedSubgraph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;

@XmlSeeAlso({Car.class, Aircraft.class})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlNamedObjectGraph(
        name = "simple",
        attributeNodes = {
        },
        subclassSubgraphs = {
                @XmlNamedSubgraph(
                        name = "simple",
                        type = Car.class,
                        attributeNodes = {
                                @XmlNamedAttributeNode("model")
                        }
                ),
                @XmlNamedSubgraph(
                        name = "simple",
                        type = Aircraft.class,
                        attributeNodes = {
                                @XmlNamedAttributeNode("numberOfPassengers")
                        }
                )
        }
)
public class Vehicle {
    public String id;

    public void setId(String id) { this.id = id; }
    public String getId() { return id; }
}
