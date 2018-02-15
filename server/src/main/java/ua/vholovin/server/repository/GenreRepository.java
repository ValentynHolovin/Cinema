package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Genre;

public interface GenreRepository extends CrudRepository<Genre, Integer> {
}
