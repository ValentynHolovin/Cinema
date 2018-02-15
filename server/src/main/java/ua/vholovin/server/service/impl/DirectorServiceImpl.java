package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Director;
import ua.vholovin.server.repository.DirectorRepository;
import ua.vholovin.server.service.api.DirectorService;

@Service
public class DirectorServiceImpl extends SuperService<Director, Integer> implements DirectorService {
    @Autowired
    private DirectorRepository directorRepository;

    @Override
    protected CrudRepository<Director, Integer> getRepository() {
        return directorRepository;
    }
}
