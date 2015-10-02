package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

/**
 * Created by mmwaikar on 02-10-2015.
 */
@NodeEntity
public class HomoSapiens extends Entity {
    private String name;

    @Relationship(type = "MY_ROLE", direction = Relationship.INCOMING)
    private ARole aRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ARole getaRole() {
        return aRole;
    }

    public void setaRole(ARole aRole) {
        this.aRole = aRole;
    }

    public HomoSapiens() {}
    public HomoSapiens(String name) {
        this.name = name;
    }
}
