package com.codionics.neogm.persist.specs;

import com.codionics.neogm.domain.*;
import com.codionics.neogm.domain.specs.DomainHelper;
import com.codionics.neogm.persist.DerivedARoleDao;
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
public class DerivedARoleDaoSpecs {
    private DerivedARoleDao derivedARoleDao;

    @Before
    public void setUp() throws Exception {
        derivedARoleDao = new DerivedARoleDao(DomainHelper.NEO_URL, DomainHelper.NEO_USERNAME,
                DomainHelper.NEO_PASSWORD);
    }

    public void should_insert_data() {
        IHomoSapiens start = new DerivedHomoSapiens("d-start");
        IHomoSapiens end = new DerivedHomoSapiens("d-end");
        IARole aRole = new DerivedARole("parent");

        start.setARole(aRole);
        end.setARole(aRole);

        aRole.setStart(start);
        aRole.setEnd(end);

        IARole created = derivedARoleDao.createOrUpdate((DerivedARole)aRole);
        assertThat(created, is(notNullValue()));
    }

    public void should_find_all() {
        Iterable<DerivedARole> derivedARoles = derivedARoleDao.findAll();
        assertThat(derivedARoles, is(notNullValue()));
        assertThat(Iterables.isEmpty(derivedARoles), is(false));
        assertTrue(Iterables.size(derivedARoles) > 0);
        System.out.println(Iterables.size(derivedARoles));
    }

    @Test
    public void should_do_crud() {
//        should_insert_data();
        should_find_all();
//        should_find_by_id();
    }
}
