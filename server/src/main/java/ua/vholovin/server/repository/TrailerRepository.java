package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Trailer;

public interface TrailerRepository extends CrudRepository<Trailer, Integer> {
}
