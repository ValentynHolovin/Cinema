package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Trailer;
import ua.vholovin.server.repository.TrailerRepository;
import ua.vholovin.server.service.api.TrailerService;

@Service
public class TrailerServiceImpl extends SuperService<Trailer, Integer> implements TrailerService {
    @Autowired
    private TrailerRepository trailerRepository;

    @Override
    protected CrudRepository<Trailer, Integer> getRepository() {
        return trailerRepository;
    }
}
