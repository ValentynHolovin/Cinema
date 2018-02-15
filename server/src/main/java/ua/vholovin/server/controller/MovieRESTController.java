package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Movie;
import ua.vholovin.server.service.api.MovieService;

@RestController
@CrossOrigin(value = "*")
public class MovieRESTController {
    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/movies/create")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @RequestMapping(value = "/movies/{id}")
    public Movie findOne(@PathVariable Integer id) {
        return movieService.findOne(id);
    }

    @RequestMapping(value = "/movies/findAll")
    public Iterable<Movie> findAll() {
        return movieService.findAll();
    }

    @RequestMapping(value = "/movies/count")
    public long count() {
        return movieService.count();
    }

    @RequestMapping(value = "/movies/delete/{id}")
    public void delete(@PathVariable Integer id) {
        movieService.delete(id);
    }

    @RequestMapping(value = "/movies/delete")
    public void delete(@RequestBody Iterable<Movie> movies) {
        movieService.delete(movies);
    }
}
