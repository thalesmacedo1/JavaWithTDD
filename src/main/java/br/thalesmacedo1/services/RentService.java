package br.thalesmacedo1.services;

import static br.thalesmacedo1.utils.DateUtils.addDays;

import java.util.Date;

import br.thalesmacedo1.entities.Movie;
import br.thalesmacedo1.entities.Rent;
import br.thalesmacedo1.entities.User;
import br.thalesmacedo1.utils.DateUtils;

public class RentService {

	public Rent rentMovie(User user, Movie movie) {
		Rent rent = new Rent();
		rent.setMovie(movie);
		rent.setUser(user);
		rent.setDataRent(new Date());
		rent.setValue(movie.getRentPrice());

		// Entrega no day seguinte
		Date returnDate = new Date();
		returnDate = addDays(returnDate, 1);
		rent.setDataReturn(returnDate);

		// Salvando a rent...
		// TODO adicionar método para salvar

		return rent;
	}

	public static void main(String[] args) {
		// cenario
		RentService service = new RentService();
		User user = new User("User 1");
		Movie movie = new Movie("Movie 1", 2, 5.0);

		// acao
		Rent rent = service.rentMovie(user, movie);

		// verificacao
		System.out.println(rent.getValue() == 5.0);
		System.out.println(DateUtils.isSameDate(rent.getDataRent(), new Date()));
		System.out.println(DateUtils.isSameDate(rent.getDataReturn(), DateUtils.getDateWithDaysDifference(1)));
	}
}