package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Hall;

public interface HallRepository extends CrudRepository<Hall, Integer> {
}
