package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

@RelationshipEntity(type="MY_DERIVED_ROLE")
public class DerivedARole extends Entity implements IARole {
    @Property
    private String title;

    @StartNode
    private IHomoSapiens start;

    @EndNode
    private IHomoSapiens end;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IHomoSapiens getStart() {
        return start;
    }

    public void setStart(IHomoSapiens start) {
        this.start = start;
    }

    public IHomoSapiens getEnd() {
        return end;
    }

    public void setEnd(IHomoSapiens end) {
        this.end = end;
    }

    public DerivedARole() {}
    public DerivedARole(String title) {
        this.title = title;
    }
}
