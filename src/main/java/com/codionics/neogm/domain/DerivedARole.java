package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type="MY_DERIVED_ROLE")
public class DerivedARole extends Entity implements IDerivedARole {
    @Property
    private String title;

    @StartNode
    private IDerivedHomoSapiens start;

    @EndNode
    private IDerivedHomoSapiens end;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IDerivedHomoSapiens getStart() {
        return start;
    }

    public void setStart(IDerivedHomoSapiens start) {
        this.start = start;
    }

    public IDerivedHomoSapiens getEnd() {
        return end;
    }

    public void setEnd(IDerivedHomoSapiens end) {
        this.end = end;
    }

    public DerivedARole() {}
    public DerivedARole(String title) {
        this.title = title;
    }
}
