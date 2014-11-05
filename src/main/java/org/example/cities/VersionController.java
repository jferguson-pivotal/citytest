package org.example.cities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    @RequestMapping("/version")
    public String index() {
        return "I am version 2! Welcome to DC Roadshow! I have no political affiliation because I'm in DC and I need to be agnostic ";
    }
}
