package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@NodeEntity
public class Person extends Entity {
    private String name;

    @Relationship(type="LIVES_AT")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {}
}
