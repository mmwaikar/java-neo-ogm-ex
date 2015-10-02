package com.codionics.neogm.persist.specs;

import com.codionics.neogm.domain.Human;
import com.codionics.neogm.domain.HumanRole;
import com.codionics.neogm.domain.specs.DomainHelper;
import com.codionics.neogm.persist.HumanDao;
import com.codionics.neogm.persist.HumanRoleDao;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class HumanRoleDaoSpecs {

    private HumanDao humanDao;
    private HumanRoleDao humanRoleDao;

    @Before
    public void setUp() throws Exception {
        humanDao = new HumanDao(DomainHelper.NEO_URL, DomainHelper.NEO_USERNAME,
                DomainHelper.NEO_PASSWORD);

        humanRoleDao = new HumanRoleDao(DomainHelper.NEO_URL, DomainHelper.NEO_USERNAME,
                DomainHelper.NEO_PASSWORD);
    }

    public void should_insert_data() {
        // FIXME: this doesn't work
        Human mh = new Human("Billy Joe");
        Human fh = new Human("Michelle Joe");
        HumanRole hr = new HumanRole("Parent");

        mh.addMaleRole(hr);
        fh.addFemaleRole(hr);

        humanDao.createOrUpdate(mh);
        humanDao.createOrUpdate(fh);

        HumanRole created = humanRoleDao.createOrUpdate(hr);
        assertThat(created, is(notNullValue()));
    }

    public void should_find_all() {

    }

    @Test
    public void should_insert_and_then_query_data() {
        should_insert_data();
        should_find_all();
    }

}