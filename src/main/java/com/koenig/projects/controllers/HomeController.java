package com.koenig.projects.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.koenig.projects.domain.Standings;
import com.koenig.projects.repo.StandingsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HomeController {

	@Autowired
	private StandingsRepository standings;
	
    @RequestMapping("/home")
    public String index() {
    	
    	standings.save(new Standings(1,1,1));
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/")
    public String root() {
	return "redirect:/standings";    
    }
}
