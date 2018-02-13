package ua.vholovin.server.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/")
    public String getIndex() {
        return "index.html";
    }
}
