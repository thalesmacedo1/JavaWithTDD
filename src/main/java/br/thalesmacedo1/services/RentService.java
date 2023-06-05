package br.thalesmacedo1.services;

import static br.thalesmacedo1.utils.DateUtils.addDays;

import java.util.Date;

import br.thalesmacedo1.entities.Movie;
import br.thalesmacedo1.entities.Rent;
import br.thalesmacedo1.entities.User;

public class RentService {
	
	public Rent rentMovie(User user, Movie movie) {
		Rent rent = new Rent();
		rent.setMovie(movie);
		rent.setUser(user);
		rent.setDataRent(new Date());
		rent.setValue(movie.getRentPrice());

		//Entrega no day seguinte
		Date returnDate = new Date();
		returnDate = addDays(returnDate, 1);
		rent.setDataReturn(returnDate);
		
		//Salvando a rent...	
		//TODO adicionar método para salvar
		
		return rent;
	}

	public static void main(String[] args) {
   // TODO document why this method is empty
 }
}