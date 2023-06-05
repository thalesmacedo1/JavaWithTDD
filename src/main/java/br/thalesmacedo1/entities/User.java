package br.thalesmacedo1.entities;

public class User {

	private String name;
	
	public User() {}
	
	public User(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}