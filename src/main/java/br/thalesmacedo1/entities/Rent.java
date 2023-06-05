package br.thalesmacedo1.entities;

import java.util.Date;

public class Rent {

	private User user;
	private Movie movie;
	private Date dateRent;
	private Date dateReturn;
	private Double value;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Date getDataRent() {
		return dateRent;
	}
	public void setDataRent(Date dateRent) {
		this.dateRent = dateRent;
	}
	public Date getDataReturn() {
		return dateReturn;
	}
	public void setDataReturn(Date dateReturn) {
		this.dateReturn = dateReturn;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}