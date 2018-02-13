package ua.vholovin.server.service.impl;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.service.api.Service;

import java.io.Serializable;

public abstract class SuperService<T, ID extends Serializable> implements Service<T, ID> {
    @Override
    public <S extends T> S save(S var1) {
        return getRepository().save(var1);
    }

    @Override
    public <S extends T> Iterable<S> save(Iterable<S> var1) {
        return getRepository().save(var1);
    }

    @Override
    public T findOne(ID var1) {
        return getRepository().findOne(var1);
    }

    @Override
    public boolean exists(ID var1) {
        return getRepository().exists(var1);
    }

    @Override
    public Iterable<T> findAll() {
        return getRepository().findAll();
    }

    @Override
    public Iterable<T> findAll(Iterable<ID> var1) {
        return getRepository().findAll(var1);
    }

    @Override
    public long count() {
        return getRepository().count();
    }

    @Override
    public void delete(ID var1) {
        getRepository().delete(var1);
    }

    @Override
    public void delete(T var1) {
        getRepository().delete(var1);
    }

    @Override
    public void delete(Iterable<? extends T> var1) {
        getRepository().delete(var1);
    }

    @Override
    public void deleteAll() {
        getRepository().deleteAll();
    }

    protected abstract CrudRepository<T, ID> getRepository();
}
