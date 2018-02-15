package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Country;
import ua.vholovin.server.repository.CountryRepository;
import ua.vholovin.server.service.api.CountryService;

@Service
public class CountryServiceImpl extends SuperService<Country, Integer> implements CountryService {
    @Autowired
    private CountryRepository countryRepository;

    @Override
    protected CrudRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}
