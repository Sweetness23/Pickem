package com.koenig.projects.controllers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.koenig.projects.domain.StandingsRow;

@Controller
@RequestMapping("/standings")
public class StandingsController {

	@RequestMapping(method=RequestMethod.GET)
    public String showStandings(Model model) {
		ArrayList<StandingsRow> rows = new ArrayList<StandingsRow>();
		String line = "";
		try (BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Standings.csv"))) {

            while ((line = br.readLine()) != null) {
                String[] standings = line.split(",");
                ArrayList<String> teams = new ArrayList<String>();
                for(int i = 1; i < standings.length-1; i++) {
                	teams.add(standings[i]);
                }
                rows.add(new StandingsRow(standings[0],teams,standings[standings.length-1]));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
		model.addAttribute("rows", rows);
        return "standings";
    }

}
