package com.codionics.neogm.persist;

import com.codionics.neogm.domain.Entity;
import org.neo4j.ogm.session.Session;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public abstract class GenericRepository<T> implements IGenericRepository<T> {
    /*
	 * Loading relationships is not required however when listing all entities
	 * of a type. We merely require the id and name of the entity, and so a
	 * depth of 0 is used by findAll to only load simple properties of the
	 * entity but skip its relationships.
	 *
	 */
    private static final int DEPTH_LIST = 1;

    /*
     * Variable depth persistence means you can vary the depth of fetches
     * depending on the shape of your data and application.
     *
     * The default depth is 1, which loads simple properties of the entity and
     * its immediate relations. This is sufficient for the find method, which is
     * used in the application to present a create or edit form for an entity.
     *
     * The default save depth is -1, or everything that has been modified and
     * can be reached from the entity up to an infinite depth. This means we can
     * persist all our changes in one go.
     *
     */
    private static final int DEPTH_ENTITY = 1;

    private Session session;

    public GenericRepository(String url, String username, String password) {
        super();
        session = Neo4jSessionFactory.getInstance().getNeo4jSession(url, username, password);
    }

    public Iterable<T> findAll() {
        return session.loadAll(getEntityType(), DEPTH_LIST);
    }

    public T findOne(Long id) {
        return session.load(getEntityType(), id, DEPTH_ENTITY);
    }

    public void delete(T entity) {
        session.delete(session.load(getEntityType(), ((Entity) entity).getId()));
    }

    public T createOrUpdate(T entity) {
        session.save(entity, DEPTH_ENTITY);
        return findOne(((Entity) entity).getId());
    }

    public abstract Class<T> getEntityType();
}
