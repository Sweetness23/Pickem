package com.koenig.projects.controllers;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koenig.projects.domain.Pick;
import com.koenig.projects.repo.PickRepository;

@Controller
@RequestMapping("/submission")
public class PickController {
	
	@Autowired
	private PickRepository pickRepo;

    @RequestMapping(method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("pick", new Pick());
        return "submission";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Pick pick) {
    	String hash = pick.getName() + pick.getTeam();
    	pick.setId(hash.hashCode());
    	ZonedDateTime b = ZonedDateTime.now(ZoneId.of("America/Chicago"));
    	pick.setDate(b);
    	pickRepo.save(pick);
        return "redirect:thank";
    }

}
