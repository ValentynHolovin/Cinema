package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Actor;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
}
