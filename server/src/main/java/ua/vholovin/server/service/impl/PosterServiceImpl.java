package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.domain.Poster;
import ua.vholovin.server.repository.PosterRepository;

@Service
public class PosterServiceImpl extends SuperService<Poster, Integer> {
    @Autowired
    private PosterRepository posterRepository;

    @Override
    protected CrudRepository<Poster, Integer> getRepository() {
        return posterRepository;
    }
}
