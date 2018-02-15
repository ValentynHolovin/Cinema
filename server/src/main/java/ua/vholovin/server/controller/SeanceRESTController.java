package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Seance;
import ua.vholovin.server.service.api.SeanceService;

@RestController
@CrossOrigin(value = "*")
public class SeanceRESTController {
    @Autowired
    private SeanceService seanceService;

    @RequestMapping(value = "/seances/create")
    public Seance save(@RequestBody Seance seance) {
        return seanceService.save(seance);
    }

    @RequestMapping(value = "/seances/{id}")
    public Seance findOne(@PathVariable Integer id) {
        return seanceService.findOne(id);
    }

    @RequestMapping(value = "/seances/findAll")
    public Iterable<Seance> findAll() {
        return seanceService.findAll();
    }

    @RequestMapping(value = "/seances/count")
    public long count() {
        return seanceService.count();
    }

    @RequestMapping(value = "/seances/delete/{id}")
    public void delete(@PathVariable Integer id) {
        seanceService.delete(id);
    }

    @RequestMapping(value = "/seances/delete")
    public void delete(@RequestBody Iterable<Seance> seances) {
        seanceService.delete(seances);
    }
}
