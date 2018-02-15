package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Actor;
import ua.vholovin.server.service.api.ActorService;

@RestController
public class ActorRESTController {
    @Autowired
    private ActorService actorService;

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/actors/{id}")
    public Actor findOne(@PathVariable Integer id) {
        return actorService.findOne(id);
    }

    @CrossOrigin(value = "*")
    @RequestMapping(value = "actors/create")
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.save(actor);
    }
}
