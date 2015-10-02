package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Human;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class HumanDao extends GenericRepository<Human> implements IHumanDao {

    public HumanDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<Human> getEntityType() {
        return Human.class;
    }
}
