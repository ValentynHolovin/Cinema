package ua.vholovin.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainRESTController {

    @CrossOrigin(value = "*")
    @RequestMapping(value = "/")
    public String getIndex() {
        return "index.html";
    }
}
