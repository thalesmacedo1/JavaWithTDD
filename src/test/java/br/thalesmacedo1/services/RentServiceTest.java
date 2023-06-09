package br.thalesmacedo1.services;

import java.util.Date;

import org.junit.*;

import br.thalesmacedo1.entities.Movie;
import br.thalesmacedo1.entities.Rent;
import br.thalesmacedo1.entities.User;
import br.thalesmacedo1.utils.DateUtils;

public class RentServiceTest {
    @Test
    public void teste() {
        // cenario
        RentService service = new RentService();
        User user = new User("User 1");
        Movie movie = new Movie("Movie 1", 2, 5.0);

        // acao
        Rent rent = service.rentMovie(user, movie);

        // verificacao
        Assert.assertEquals(5.0, rent.getValue(), 0.01);
        Assert.assertTrue(DateUtils.isSameDate(rent.getDataRent(), new Date()));
        Assert.assertTrue(DateUtils.isSameDate(rent.getDataReturn(), DateUtils.getDateWithDaysDifference(1)));
    }
}
