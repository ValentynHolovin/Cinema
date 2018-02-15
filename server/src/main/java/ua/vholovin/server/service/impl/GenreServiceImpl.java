package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Genre;
import ua.vholovin.server.repository.GenreRepository;
import ua.vholovin.server.service.api.GenreService;

@Service
public class GenreServiceImpl extends SuperService<Genre, Integer> implements GenreService {
    @Autowired
    private GenreRepository genreRepository;

    @Override
    protected CrudRepository<Genre, Integer> getRepository() {
        return genreRepository;
    }
}
