package com.koenig.projects.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.koenig.projects.domain.Standings;
import com.koenig.projects.repo.StandingsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/thank")
public class ThankController {

	@RequestMapping(method=RequestMethod.GET)
    public String index() {
        return "thank";
    }

}
