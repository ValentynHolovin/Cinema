package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Poster;

public interface PosterRepository extends CrudRepository<Poster, Integer> {
}
