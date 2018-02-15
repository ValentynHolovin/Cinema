package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Movie;
import ua.vholovin.server.repository.MovieRepository;

@Service
public class MovieServiceImpl extends SuperService<Movie, Integer> {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    protected CrudRepository<Movie, Integer> getRepository() {
        return movieRepository;
    }
}
