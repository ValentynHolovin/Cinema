package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Hall;
import ua.vholovin.server.repository.HallRepository;

public class HallServiceImpl extends SuperService<Hall, Integer> {
    @Autowired
    private HallRepository hallRepository;

    @Override
    protected CrudRepository<Hall, Integer> getRepository() {
        return hallRepository;
    }
}
