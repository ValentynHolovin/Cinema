package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Place;

public interface PlaceRepository extends CrudRepository<Place, Integer> {
}
