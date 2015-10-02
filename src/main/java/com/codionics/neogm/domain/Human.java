package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@NodeEntity
public class Human extends Entity {
    private String name;

    @Relationship(type = "HAS_ROLE")
    private HumanRole humanRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMaleRole(HumanRole humanRole) {
        this.humanRole = humanRole;
        humanRole.getMales().add(this);
    }

    public void addFemaleRole(HumanRole humanRole) {
        this.humanRole = humanRole;
        humanRole.getFemales().add(this);
    }

    public Human() {}

    public Human(String name) {
        this.name = name;
    }
}
