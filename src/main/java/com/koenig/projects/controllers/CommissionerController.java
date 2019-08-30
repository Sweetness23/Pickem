package com.koenig.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.koenig.projects.repo.PickRepository;

@Controller
@RequestMapping("/commissioner")
public class CommissionerController {
	
	@Autowired
	private PickRepository pickRepo;

    @RequestMapping(method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("picks", pickRepo.findAllByOrderByDateDesc());
        return "commissioner";
    }

}
