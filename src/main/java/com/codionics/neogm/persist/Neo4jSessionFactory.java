package com.codionics.neogm.persist;

import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public class Neo4jSessionFactory {
    private static Neo4jSessionFactory factory = new Neo4jSessionFactory();

    private final static SessionFactory sessionFactory = new SessionFactory("com.codionics.neogm.domain");

    public static Neo4jSessionFactory getInstance() {
        return factory;
    }

    private Neo4jSessionFactory() {
    }

    public Session getNeo4jSession(String url, String username, String password) {
        return sessionFactory.openSession(url, username, password);
    }
}
