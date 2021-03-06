package com.koenig.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.koenig.projects.repo.StandingsRepository;

@Controller
@RequestMapping("/standings")
public class StandingsController {
	
	@Autowired
	private StandingsRepository standingsRepo;

	@RequestMapping(method=RequestMethod.GET)
    public String showStandings(Model model) {
		model.addAttribute("standings", standingsRepo.findAll());
        return "standings";
    }

}
