package com.koenig.projects.domain;

public class Standings {

	private Integer id;
	private int loss;
	private int win;
	
	public Standings(Integer id, int win, int loss) {
		this.id = id;
		this.win = win;
		this.loss = loss;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getLoss() {
		return loss;
	}
	public void setLoss(int loss) {
		this.loss = loss;
	}
	public int getWin() {
		return win;
	}
	public void setWin(int win) {
		this.win = win;
	}
}
