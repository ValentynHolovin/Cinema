package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Movie;
import ua.vholovin.server.repository.MovieRepository;
import ua.vholovin.server.service.api.MovieService;

@Service
public class MovieServiceImpl extends SuperService<Movie, Integer> implements MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Override
    protected CrudRepository<Movie, Integer> getRepository() {
        return movieRepository;
    }
}
