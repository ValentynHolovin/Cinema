package ua.vholovin.server.dao.api;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Actor;

public interface ActorDao extends CrudRepository<Actor, Integer> {
}
