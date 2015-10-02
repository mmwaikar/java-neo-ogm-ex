package com.codionics.neogm.persist.specs;

import com.codionics.neogm.domain.ARole;
import com.codionics.neogm.domain.HomoSapiens;
import com.codionics.neogm.domain.Role;
import com.codionics.neogm.domain.specs.DomainHelper;
import com.codionics.neogm.persist.ARoleDao;
import com.codionics.neogm.persist.RoleDao;
import com.google.common.collect.Iterables;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by mmwaikar on 02-10-2015.
 */
public class ARoleDaoSpecs {
    private ARoleDao aRoleDao;

    @Before
    public void setUp() throws Exception {
        aRoleDao = new ARoleDao(DomainHelper.NEO_URL, DomainHelper.NEO_USERNAME,
                DomainHelper.NEO_PASSWORD);
    }

    public void should_insert_data() {
        HomoSapiens start = new HomoSapiens("h1-start");
        HomoSapiens end = new HomoSapiens("h1-end");
        ARole aRole = new ARole("parent");

        start.setaRole(aRole);
        end.setaRole(aRole);

        aRole.setStart(start);
        aRole.setEnd(end);

        ARole created = aRoleDao.createOrUpdate(aRole);
        assertThat(created, is(notNullValue()));
    }

    public void should_find_all() {
        Iterable<ARole> aRoles = aRoleDao.findAll();
        assertThat(aRoles, is(notNullValue()));
        assertThat(Iterables.isEmpty(aRoles), is(false));
        assertTrue(Iterables.size(aRoles) > 0);
        System.out.println(Iterables.size(aRoles));
    }

    public void should_find_by_id() {
        ARole aRole = aRoleDao.findOne(9L);
        assertThat(aRole, is(notNullValue()));
        assertThat(aRole.getTitle(), is("parent"));
        System.out.println(aRole.getStart().getName());
    }

    @Test
    public void should_do_crud() {
//        should_insert_data();
//        should_find_all();
        should_find_by_id();
    }
}
