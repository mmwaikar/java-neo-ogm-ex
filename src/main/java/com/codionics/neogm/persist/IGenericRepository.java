package com.codionics.neogm.persist;

/**
 * Created by mmwaikar on 01-10-2015.
 */
public interface IGenericRepository<T> {
    public Iterable<T> findAll();
    public T findOne(Long id);
    public T createOrUpdate(T entity);
    public void delete(T entity);
}
