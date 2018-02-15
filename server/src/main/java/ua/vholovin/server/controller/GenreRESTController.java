package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Genre;
import ua.vholovin.server.service.api.GenreService;

@RestController
@CrossOrigin(value = "*")
public class GenreRESTController {
    @Autowired
    private GenreService genreService;

    @RequestMapping(value = "/genres/create")
    public Genre save(@RequestBody Genre genre) {
        return genreService.save(genre);
    }

    @RequestMapping(value = "/genres/{id}")
    public Genre findOne(@PathVariable Integer id) {
        return genreService.findOne(id);
    }

    @RequestMapping(value = "/genres/findAll")
    public Iterable<Genre> findAll() {
        return genreService.findAll();
    }

    @RequestMapping(value = "/genres/count")
    public long count() {
        return genreService.count();
    }

    @RequestMapping(value = "/genres/delete/{id}")
    public void delete(@PathVariable Integer id) {
        genreService.delete(id);
    }

    @RequestMapping(value = "/genres/delete")
    public void delete(@RequestBody Iterable<Genre> genres) {
        genreService.delete(genres);
    }
}
