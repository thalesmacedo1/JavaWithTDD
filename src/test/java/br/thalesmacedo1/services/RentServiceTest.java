package br.thalesmacedo1.services;

import java.util.Date;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.*;
import org.junit.rules.ErrorCollector;

import br.thalesmacedo1.entities.Movie;
import br.thalesmacedo1.entities.Rent;
import br.thalesmacedo1.entities.User;
import br.thalesmacedo1.utils.DateUtils;

public class RentServiceTest {

    @Rule
    public ErrorCollector error = new ErrorCollector();

    @Test
    public void teste() {
        // cenario
        RentService service = new RentService();
        User user = new User("User 1");
        Movie movie = new Movie("Movie 1", 2, 5.0);

        // acao
        Rent rent = service.rentMovie(user, movie);

        // verificacao
        // error.checkThat(rent.getValue(), CoreMatchers.is(6.0));
        error.checkThat(DateUtils.isSameDate(rent.getDataRent(), new Date()), CoreMatchers.is(true));
        error.checkThat(DateUtils.isSameDate(rent.getDataReturn(), DateUtils.getDateWithDaysDifference(1)),
                CoreMatchers.is(true));

        error.checkThat(rent.getValue(), CoreMatchers.is(5.0));
        error.checkThat(rent.getValue(), CoreMatchers.not(4.0));

    }
}
