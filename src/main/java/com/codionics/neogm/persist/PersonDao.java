package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Person;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class PersonDao extends GenericRepository<Person> {

    public PersonDao(String url, String username, String password) {
        super(url, username, password);
    }

    /* (non-Javadoc)
     * @see com.intercax.syndeia.connect.graph.GraphDao#getEntityType()
     */
    @Override
    public Class<Person> getEntityType() {
        return Person.class;
    }
}
