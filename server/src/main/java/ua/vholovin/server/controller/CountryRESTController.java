package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.Country;
import ua.vholovin.server.service.api.CountryService;

@RestController
@CrossOrigin(value = "*")
public class CountryRESTController {
    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "countries/create")
    public Country save(@RequestBody Country country) {
        return countryService.save(country);
    }

    @RequestMapping(value = "/countries/{id}")
    public Country findOne(@PathVariable Integer id) {
        return countryService.findOne(id);
    }

    @RequestMapping(value = "/countries/findAll")
    public Iterable<Country> findAll() {
        return countryService.findAll();
    }

    @RequestMapping(value = "/countries/count")
    public long count() {
        return countryService.count();
    }

    @RequestMapping(value = "/countries/delete/{id}")
    public void delete(@PathVariable Integer id) {
        countryService.delete(id);
    }

    @RequestMapping(value = "/countries/delete")
    public void delete(@RequestBody Iterable<Country> countries) {
        countryService.delete(countries);
    }
}
