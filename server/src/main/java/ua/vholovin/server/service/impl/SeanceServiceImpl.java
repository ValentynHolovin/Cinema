package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Seance;
import ua.vholovin.server.repository.SeanceRepository;

@Service
public class SeanceServiceImpl extends SuperService<Seance, Integer> {
    @Autowired
    private SeanceRepository seanceRepository;

    @Override
    protected CrudRepository<Seance, Integer> getRepository() {
        return seanceRepository;
    }
}
