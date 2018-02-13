package ua.vholovin.server.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.vholovin.server.dao.api.ActorDao;
import ua.vholovin.server.domain.Actor;
import ua.vholovin.server.service.api.ActorService;

import java.util.List;

@Service
public class ActorServiceImpl implements ActorService {
    @Autowired
    private ActorDao actorDao;

    public Actor save(Actor obj) {
        return actorDao.save(obj);
    }

    public List<Actor> readAll() {
        return null;
    }

    public Actor findOne(Integer id) {
        return actorDao.findOne(id);
    }
}
