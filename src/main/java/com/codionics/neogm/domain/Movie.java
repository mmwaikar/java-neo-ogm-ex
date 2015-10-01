package com.codionics.neogm.domain;

import org.neo4j.ogm.annotation.NodeEntity;

/**
 * Created by mmwaikar on 01-10-2015.
 */
@NodeEntity
public class Movie extends Entity {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Movie() {}
    public Movie(String title) {
        this.title = title;
    }
}
