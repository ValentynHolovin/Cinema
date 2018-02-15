package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
