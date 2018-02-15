package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Actor;
import ua.vholovin.server.service.api.ActorService;

@RestController
@CrossOrigin(value = "*")
public class ActorRESTController {
    @Autowired
    private ActorService actorService;

    @RequestMapping(value = "actors/create")
    public Actor save(@RequestBody Actor actor) {
        return actorService.save(actor);
    }

    @RequestMapping(value = "/actors/{id}")
    public Actor findOne(@PathVariable Integer id) {
        return actorService.findOne(id);
    }

    @RequestMapping(value = "/actors/findAll")
    public Iterable<Actor> findAll() {
        return actorService.findAll();
    }

    @RequestMapping(value = "/actors/count")
    public long count() {
        return actorService.count();
    }

    @RequestMapping(value = "/actors/delete/{id}")
    public void delete(@PathVariable Integer id) {
        actorService.delete(id);
    }

    @RequestMapping(value = "/actors/delete")
    public void delete(@RequestBody Iterable<Actor> actors) {
        actorService.delete(actors);
    }
}
