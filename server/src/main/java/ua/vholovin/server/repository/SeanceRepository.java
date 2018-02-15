package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Seance;

public interface SeanceRepository extends CrudRepository<Seance, Integer> {
}
