package com.codionics.neogm.persist.specs;


import com.codionics.neogm.domain.Actor;
import com.codionics.neogm.domain.Movie;
import com.codionics.neogm.domain.Role;
import com.codionics.neogm.domain.specs.DomainHelper;
import com.codionics.neogm.persist.RoleDao;
import com.google.common.collect.Iterables;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class RoleDaoSpecs {

    private RoleDao roleDao;

    @Before
    public void setUp() throws Exception {
        roleDao = new RoleDao(DomainHelper.NEO_URL, DomainHelper.NEO_USERNAME,
                DomainHelper.NEO_PASSWORD);
    }

    public void should_insert_data() {
        Movie m = new Movie("The Matrix");
        Actor a = new Actor("Keanu Reeves");
        Role r = new Role("Lead Actor");

        a.setPlayedIn(r);
        r.setActor(a);
        r.setMovie(m);
//		movieDao.createOrUpdate(m);
//		actorDao.createOrUpdate(a);

        Role created = roleDao.createOrUpdate(r);
        assertThat(created, is(notNullValue()));
    }

    public void should_find_all() {
        Iterable<Role> roles = roleDao.findAll();
        assertThat(roles, is(notNullValue()));
        assertThat(Iterables.isEmpty(roles), is(false));
        System.out.println(Iterables.size(roles));
    }

    @Test
    public void should_insert_and_then_query_data() {
        should_insert_data();
        should_find_all();
    }
}