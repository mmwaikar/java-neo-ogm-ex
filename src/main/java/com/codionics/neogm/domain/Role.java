package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@RelationshipEntity(type="PLAYED_IN")
public class Role extends Entity {
    @Property
    private String title;

    @StartNode
    private Actor actor;

    @EndNode
    private Movie movie;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Role() {}
    public Role(String title) {
        this.title = title;
    }
}
