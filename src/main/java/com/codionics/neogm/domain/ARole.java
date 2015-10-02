package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by mmwaikar on 02-10-2015.
 */
@RelationshipEntity(type="MY_ROLE")
public class ARole extends Entity {
    @Property
    private String title;

    @StartNode
    private HomoSapiens start;

    @EndNode
    private HomoSapiens end;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HomoSapiens getStart() {
        return start;
    }

    public void setStart(HomoSapiens start) {
        this.start = start;
    }

    public HomoSapiens getEnd() {
        return end;
    }

    public void setEnd(HomoSapiens end) {
        this.end = end;
    }

    public ARole() {}
    public ARole(String title) {
        this.title = title;
    }
}
