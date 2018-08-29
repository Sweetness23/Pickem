package com.koenig.projects.domain;

import java.time.ZonedDateTime;

public class Pick {

	private String name;
	private String team;
	private String email;
	private String week;
	private Integer id;
	private ZonedDateTime date;
	
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
	public ZonedDateTime getDate() {
		return date;
	}
	public void setDate(ZonedDateTime date) {
		this.date = date;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
}
