package com.koenig.projects.domain;

import java.time.LocalDate;

public class Pick {

	private String name;
	private String team;
	private Integer id;
	private LocalDate date;
	
	public Pick(String name, String team) {
		this.name = name;
		this.team = team;
	}
	public Pick() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
