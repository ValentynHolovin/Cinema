package ua.vholovin.server.service.api;

import java.util.List;

public interface Service<T, ID> {
    T save(T obj);

    List<T> readAll();

    T findOne(ID id);
}
