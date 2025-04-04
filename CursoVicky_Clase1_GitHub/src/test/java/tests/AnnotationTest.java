package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {

    @BeforeSuite
    public void beforeSuiteMessage(){
        System.out.println("Acciones antes del suite");
    }

    @BeforeTest
    public void beforeTestMessage(){
        System.out.println("Acciones antes del Test");
    }

    @Test(priority = 0,groups = "smoke")
    public void assertPriorityZeroTest() {
        String expectedWelcome = "Welcome back";
        String actualWelcome = "Welcome back";

        Assert.assertEquals(actualWelcome, expectedWelcome);
        System.out.println("Primera prueba, smoke");
    }

    @Test(priority = 2, groups = {"smoke", "sanity"})
    public void c_method() {
        System.out.println("Segunda prueba, smoke y sanity");
    }

    @Test(priority = 3, groups = "sanity")
    public void b_method() {
        System.out.println("Tercera prueba, sanity");
    }
}






