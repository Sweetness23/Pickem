package com.koenig.projects.controllers;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.koenig.projects.domain.Pick;
import com.koenig.projects.domain.User;
import com.koenig.projects.repo.PickRepository;
import com.koenig.projects.repo.UserRepository;

@Controller
@RequestMapping("/submission")
public class PickController {
	
	@Autowired
	private PickRepository pickRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
    private JavaMailSender mailSender;

    @RequestMapping(method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("pick", new Pick());
        model.addAttribute("userList", userRepo.findAll());
        return "submission";
    }

    @RequestMapping(method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Pick pick) {
    	String hash = pick.getTeam()+pick.getUserId()+pick.getWeek();
    	pick.setId(hash.hashCode());
    	ZonedDateTime b = ZonedDateTime.now(ZoneId.of("America/Chicago"));
    	pick.setDate(b);
    	pickRepo.save(pick);
    	SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(userRepo.findFirstById(pick.getUserId()).getEmail());
        message.setSubject("Loser Pool Pick");
        message.setText("Your pick was: " + pick.getTeam() + " for week: " + pick.getWeek());
        mailSender.send(message);
        return "redirect:thank";
    }

}
