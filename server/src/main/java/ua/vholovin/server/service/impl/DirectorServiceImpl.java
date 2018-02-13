package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import ua.vholovin.server.domain.Director;
import ua.vholovin.server.repository.DirectorRepository;

public class DirectorServiceImpl extends SuperService<Director, Integer> {
    @Autowired
    private DirectorRepository directorRepository;

    @Override
    protected CrudRepository<Director, Integer> getRepository() {
        return directorRepository;
    }
}
