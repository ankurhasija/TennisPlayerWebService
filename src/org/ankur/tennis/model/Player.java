package org.ankur.tennis.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Player {

	private String name;
	private String category;
	private int rank;
	private int titles;
	
	public Player() {
		
	}
	
	public Player(String name, String category, int rank, int titles) {
		
		this.name = name;
		this.category= category;
		this.rank = rank;
		this.titles = titles;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getTitles() {
		return titles;
	}
	public void setTitles(int titles) {
		this.titles = titles;
	}
	
	
	
	
}
