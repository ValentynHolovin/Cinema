package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Country;
import ua.vholovin.server.repository.CountryRepository;

public class CountryServiceImpl extends SuperService<Country, Integer> {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    protected CrudRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}
