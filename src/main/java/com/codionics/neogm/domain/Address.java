package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@NodeEntity
public class Address extends Entity {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address() {}
}
