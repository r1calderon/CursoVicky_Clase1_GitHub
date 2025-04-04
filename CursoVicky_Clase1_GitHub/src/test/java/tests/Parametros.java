package tests;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.Assert;

public class Parametros {

    @Test(priority = 0,groups = "smoke")
    public void firstMethod() {
        System.out.println("Parametros First Smoke Test");
    }
    @Test(priority = 1,groups = "regression")
    public void secondMethod() {
        System.out.println("Parametros Second Regression Test");
    }
    @Test(priority = 2,groups = "sanity")
    public void thirdMethod() {
        System.out.println("Parametros Third Sanity Test");
    }
    @Test(priority = 3,groups = "smoke")
    public void fourthMethod() {
        System.out.println("Parametros Fourth Smoke Test");
    }

    @Test(priority = 4,groups = "regression")
    @Parameters({"username"})
    public void fifthMethod(String username) {
        String expectedUsername = "Rigo1";
        Assert.assertEquals(expectedUsername, username);
    }

    @Test(priority = 5,groups = "sanity")
    @Parameters({"username", "corpDomain"})
    public void optionalParameterTest(String username, @Optional("globant.com") String corpDomain) {
        Assert.assertFalse(username.isEmpty());
        Assert.assertFalse(corpDomain.isEmpty());
    }

    @Test(priority = 5,groups = "smoke")
    @Parameters({"username", "corpDomain"})
    public void optionalParameterTest2(@Optional("Rigo2") String username, @Optional("globant.com") String corpDomain) {
        Assert.assertFalse(username.isEmpty());
        Assert.assertFalse(corpDomain.isEmpty());
        System.out.println("El usuario es: "+ username);
        System.out.println("El corpDomain: " +corpDomain);
    }

    @Test(priority = 6,groups = "regression")
    @Parameters({"username"})
    public void optionalParameterTest3(@Optional("Rigo2") String username) {
        Assert.assertFalse(username.isEmpty());
        System.out.println("El usuario es: "+ username);
    }


}
