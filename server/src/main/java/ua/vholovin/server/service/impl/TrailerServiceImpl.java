package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Trailer;
import ua.vholovin.server.repository.TrailerRepository;

public class TrailerServiceImpl extends SuperService<Trailer, Integer> {
    @Autowired
    private TrailerRepository trailerRepository;

    @Override
    protected CrudRepository<Trailer, Integer> getRepository() {
        return trailerRepository;
    }
}
