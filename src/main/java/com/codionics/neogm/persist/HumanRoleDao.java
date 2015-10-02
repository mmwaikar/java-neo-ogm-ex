package com.codionics.neogm.persist;

import com.codionics.neogm.domain.HumanRole;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class HumanRoleDao extends GenericRepository<HumanRole> implements IHumanRoleDao {

    public HumanRoleDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<HumanRole> getEntityType() {
        return HumanRole.class;
    }
}
