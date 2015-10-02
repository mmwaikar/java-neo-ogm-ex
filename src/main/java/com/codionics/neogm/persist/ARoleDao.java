package com.codionics.neogm.persist;

import com.codionics.neogm.domain.ARole;

/**
 * Created by mmwaikar on 02-10-2015.
 */
public class ARoleDao extends GenericRepository<ARole> implements IARoleDao {
    public ARoleDao(String url, String username, String password) {
        super(url, username, password);
    }

    @Override
    public Class<ARole> getEntityType() {
        return ARole.class;
    }
}
