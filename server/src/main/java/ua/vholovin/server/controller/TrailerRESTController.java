package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.vholovin.server.domain.Trailer;
import ua.vholovin.server.service.api.TrailerService;

@RestController
@CrossOrigin(value = "*")
public class TrailerRESTController {
    @Autowired
    private TrailerService trailerService;

    @RequestMapping(value = "/trailers/{id}")
    public Trailer findOne(@PathVariable Integer id) {
        return trailerService.findOne(id);
    }

    @RequestMapping(value = "/trailers/findAll")
    public Iterable<Trailer> findAll() {
        return trailerService.findAll();
    }

    @RequestMapping(value = "/trailers/count")
    public long count() {
        return trailerService.count();
    }
}
