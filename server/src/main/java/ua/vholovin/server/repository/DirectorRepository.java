package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Director;

public interface DirectorRepository extends CrudRepository<Director, Integer> {
}
