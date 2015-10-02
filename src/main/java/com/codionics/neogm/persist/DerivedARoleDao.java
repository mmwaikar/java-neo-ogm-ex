package com.codionics.neogm.persist;

import com.codionics.neogm.domain.DerivedARole;

/**
 * Created by mmwaikar on 02-10-2015.
 */
public class DerivedARoleDao extends GenericRepository<DerivedARole> {
    public DerivedARoleDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<DerivedARole> getEntityType() {
        return DerivedARole.class;
    }
}
