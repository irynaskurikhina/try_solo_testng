package my_testng;


import org.testng.Assert;
import org.testng.annotations.*;

public class FullAnnotationList {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("before methods");
    }


    @Test
    public void test() {
        System.out.println("Test");
        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = {"test"})
    public void dependedTest() {
        System.out.println("Test with depends");
    }

    @Test(priority = -2)
    public void testWithHighPriority() {
        System.out.println("Test with high priority");
    }

    @Test(priority = 16)
    public void testWithLowPriority() {
        System.out.println("Test with low priority");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("after groups");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("after method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite");
    }
}
