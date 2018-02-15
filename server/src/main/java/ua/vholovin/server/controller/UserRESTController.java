package ua.vholovin.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.vholovin.server.domain.User;
import ua.vholovin.server.service.api.UserService;

@RestController
@CrossOrigin(value = "*")
public class UserRESTController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users/create")
    public User save(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/users/{id}")
    public User findOne(@PathVariable Integer id) {
        return userService.findOne(id);
    }

    @RequestMapping(value = "/users/findAll")
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping(value = "/users/count")
    public long count() {
        return userService.count();
    }

    @RequestMapping(value = "/users/delete/{id}")
    public void delete(@PathVariable Integer id) {
        userService.delete(id);
    }

    @RequestMapping(value = "/users/delete")
    public void delete(@RequestBody Iterable<User> users) {
        userService.delete(users);
    }
}
