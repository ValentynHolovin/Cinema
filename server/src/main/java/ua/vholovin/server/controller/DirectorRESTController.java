package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Director;
import ua.vholovin.server.service.api.DirectorService;

@RestController
@CrossOrigin(value = "*")
public class DirectorRESTController {
    @Autowired
    private DirectorService directorService;

    @RequestMapping(value = "/directors/create")
    public Director save(@RequestBody Director director) {
        return directorService.save(director);
    }

    @RequestMapping(value = "/directors/{id}")
    public Director findOne(@PathVariable Integer id) {
        return directorService.findOne(id);
    }

    @RequestMapping(value = "/directors/findAll")
    public Iterable<Director> findAll() {
        return directorService.findAll();
    }

    @RequestMapping(value = "/directors/count")
    public long count() {
        return directorService.count();
    }

    @RequestMapping(value = "/directors/delete/{id}")
    public void delete(@PathVariable Integer id) {
        directorService.delete(id);
    }

    @RequestMapping(value = "/directors/delete")
    public void delete(@RequestBody Iterable<Director> directors) {
        directorService.delete(directors);
    }
}
