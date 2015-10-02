package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@NodeEntity
public class Actor extends Entity {
    private String name;
    private Role playedIn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getPlayedIn() {
        return playedIn;
    }

    public void setPlayedIn(Role playedIn) {
        this.playedIn = playedIn;
    }

    public Actor() {}
    public Actor(String name) {
        this.name = name;
    }
}

