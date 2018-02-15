package ua.vholovin.server.repository;

import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}
