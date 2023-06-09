package br.thalesmacedo1.services;

import org.junit.Assert;
import org.junit.Test;

import br.thalesmacedo1.entities.User;

public class AssertTest {

    @Test
    public void test() {
        Assert.assertTrue(true);
        Assert.assertFalse(false);

        Assert.assertEquals(1, 1);
        Assert.assertEquals(0.51234, 0.512, 0.001);
        Assert.assertEquals(Math.PI, 3.14, 0.01);

        int i = 5;
        Integer j = 5;

        // Assert.assertEquals(i, j); // It's not allowed to compare int with Integer
        Assert.assertEquals(Integer.valueOf(i), j);
        Assert.assertEquals(i, j.intValue());

        // Assert.assertEquals("bola", "Bola"); // It fails the test
        Assert.assertTrue("bola".equalsIgnoreCase("Bola")); // It fails the test
        Assert.assertTrue("bola".startsWith("bo"));

        User user1 = new User("User 1");
        User user2 = new User("User 1");

        Assert.assertEquals(user1, user2); // By default, t'll fail because references are different even though they have the same attribute. If you override equals method inside the class, it works

        // Assert.assertSame(user1, user2); // It compares object by reference even when equals methods is overrided in the tested class

        User user3 = null;

        Assert.assertNull(user3);
        Assert.assertNotNull(user1);

        
    }
}
