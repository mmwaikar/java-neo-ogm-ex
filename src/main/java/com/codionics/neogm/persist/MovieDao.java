package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Movie;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class MovieDao extends GenericRepository<Movie> implements IMovieDao {
    public MovieDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<Movie> getEntityType() {
        return Movie.class;
    }
}
