package net.ab_soft;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker checkAge = new AgeChecker();
        Assert.assertTrue(checkAge.canPlayGames(19), "Aged user can play game");
    }
}
