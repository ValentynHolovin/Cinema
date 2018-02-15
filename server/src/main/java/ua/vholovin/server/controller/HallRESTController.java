package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Hall;
import ua.vholovin.server.service.api.HallService;

@RestController
@CrossOrigin(value = "*")
public class HallRESTController {
    @Autowired
    private HallService hallService;

    @RequestMapping(value = "/halls/create")
    public Hall save(@RequestBody Hall hall) {
        return hallService.save(hall);
    }

    @RequestMapping(value = "/halls/{id}")
    public Hall findOne(@PathVariable Integer id) {
        return hallService.findOne(id);
    }

    @RequestMapping(value = "/halls/findAll")
    public Iterable<Hall> findAll() {
        return hallService.findAll();
    }

    @RequestMapping(value = "/halls/count")
    public long count() {
        return hallService.count();
    }

    @RequestMapping(value = "/halls/delete/{id}")
    public void delete(@PathVariable Integer id) {
        hallService.delete(id);
    }

    @RequestMapping(value = "/halls/delete")
    public void delete(@RequestBody Iterable<Hall> halls) {
        hallService.delete(halls);
    }
}
