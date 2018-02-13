package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Movie;
import ua.vholovin.server.repository.MovieRepository;

public class MovieServiceImpl extends SuperService<Movie, Integer> {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    protected CrudRepository<Movie, Integer> getRepository() {
        return movieRepository;
    }
}
