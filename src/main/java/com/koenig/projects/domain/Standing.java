package com.koenig.projects.domain;

import java.util.List;

public class Standing {

	private User user;
	private String wins;
	private List<String> picks;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getWins() {
		return wins;
	}
	public void setWins(String wins) {
		this.wins = wins;
	}
	public List<String> getPicks() {
		return picks;
	}
	public void setPicks(List<String> picks) {
		this.picks = picks;
	}
	
}
