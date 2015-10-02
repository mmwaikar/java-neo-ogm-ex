package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class DerivedHomoSapiens extends Entity implements IDerivedHomoSapiens {
    private String name;

    @Relationship(type = "MY_DERIVED_ROLE", direction = Relationship.INCOMING)
    private IDerivedARole aRole;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDerivedARole getaRole() {
        return aRole;
    }

    public void setaRole(IDerivedARole aRole) {
        this.aRole = aRole;
    }

    public DerivedHomoSapiens() {}
    public DerivedHomoSapiens(String name) {
        this.name = name;
    }
}
