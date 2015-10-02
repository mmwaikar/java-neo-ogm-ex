package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@RelationshipEntity
public class HumanRole extends Entity {
    private String role;

    /*
     *
     * FIXME: Logically, in a graph, a connection (i.e. an edge) can be
     * connected to at most two artifacts (i.e. the nodes). So this concept of a
     * connection being connected to a set of sources and a set of targets is not
     * correct. Hence it should be connected to just one source and one target.
     *
     */
    @StartNode
    private Set<Human> males = new HashSet<Human>();

    @EndNode
    private Set<Human> females = new HashSet<Human>();

    public Set<Human> getMales() {
        return males;
    }

    public Set<Human> getFemales() {
        return females;
    }

    public HumanRole() {}

    public HumanRole(String role) {
        this.role = role;
    }
}
