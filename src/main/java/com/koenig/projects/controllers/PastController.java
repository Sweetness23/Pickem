package com.koenig.projects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/past")
public class PastController {

	@RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "past";
    }

}
