package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Role;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class RoleDao extends GenericRepository<Role> implements IRoleDao {
    public RoleDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<Role> getEntityType() {
        return Role.class;
    }
}
