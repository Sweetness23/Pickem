package com.koenig.projects.domain;

import java.util.ArrayList;
import java.util.List;

public class StandingsRow {

	private String name;
	private List<String> teams;
	private String points;
	
	public StandingsRow(String name, List<String> teams, String points) {
		this.name = name;
		this.teams = teams;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}
}
