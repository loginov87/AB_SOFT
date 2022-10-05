package net.ab_soft;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker checkAge = new AgeChecker();
        Assert.assertTrue(checkAge.canPlayGames(21), "Aged user can play game");
    }


    @Test
    public void testThatTooYongUsersCanNotPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.canPlayGames(20), "Aged user can't play game");
    }
}
