package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Actor;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class ActorDao extends GenericRepository<Actor> implements IActorDao {
    public ActorDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<Actor> getEntityType() {
        return Actor.class;
    }
}
