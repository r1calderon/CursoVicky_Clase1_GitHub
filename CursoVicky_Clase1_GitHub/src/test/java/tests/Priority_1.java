package tests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.LocalDateTime;

public class Priority_1 {

    private static final Logger log = LoggerFactory.getLogger(Priority_1.class);

    @Test(priority = 0)
    public void assertPriorityZeroTest() {
        String expectedWelcome = "Welcome back";
        String actualWelcome = "Welcome back";

        Assert.assertEquals(actualWelcome, expectedWelcome);
    }

    @Test(priority = 2)
    public void softAssertPriorityThreeTest() {
        SoftAssert softAssert = new SoftAssert();
        String expectedString = "Estamos en 2026";
        String actualString = "Estamos en 2025";

        softAssert.assertEquals(actualString, expectedString);
        log.info("Las cadenas no son iguales");
        softAssert.assertEquals(String.valueOf(LocalDateTime.now().getYear()),
                expectedString .substring(expectedString .length() -4));
        log.info("Apesar de ello, las pruebas siguen.");
        softAssert.assertAll();
    }

    @Test(priority = 3)
        public void c_method() {
            System.out.println("This word is C");
        }
    }






