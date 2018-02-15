package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Poster;
import ua.vholovin.server.service.api.PosterService;

@RestController
@CrossOrigin(value = "*")
public class PosterRESTController {
    @Autowired
    private PosterService posterService;

    @RequestMapping(value = "/posters/{id}")
    public Poster findOne(@PathVariable Integer id) {
        return posterService.findOne(id);
    }

    @RequestMapping(value = "/posters/findAll")
    public Iterable<Poster> findAll() {
        return posterService.findAll();
    }

    @RequestMapping(value = "/posters/count")
    public long count() {
        return posterService.count();
    }
}
