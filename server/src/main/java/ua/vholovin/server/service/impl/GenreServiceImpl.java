package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Genre;
import ua.vholovin.server.repository.GenreRepository;

public class GenreServiceImpl extends SuperService<Genre, Integer> {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    protected CrudRepository<Genre, Integer> getRepository() {
        return genreRepository;
    }
}
