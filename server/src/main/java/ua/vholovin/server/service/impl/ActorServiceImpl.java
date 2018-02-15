package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import ua.vholovin.server.repository.ActorRepository;
import ua.vholovin.server.domain.Actor;
import ua.vholovin.server.service.api.ActorService;


@Service
public class ActorServiceImpl extends SuperService<Actor, Integer> implements ActorService {
    @Autowired
    private ActorRepository actorRepository;

    @Override
    protected CrudRepository<Actor, Integer> getRepository() {
        return actorRepository;
    }
}
