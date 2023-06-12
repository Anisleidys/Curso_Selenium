package Clase5;

import org.testng.annotations.*;

public class TestNGnotation {

    @BeforeSuite
    public void beforeSuiteTest() {
        System.out.println("@BeforeSuite");


    }

    @BeforeClass
    public void beforeClassTest() {
        System.out.println("@BeforClass");

    }

    @BeforeTest
    public void beforeTesting() {
        System.out.println("@BeforTest");

    }

    @BeforeMethod
    public void beforeMethodTest() {
        System.out.println("@BeforMethod");

    }

    @Test(groups = "login")
    public void Test1() {
        System.out.println("Test 1 mMthod");

    }

    @Test(groups = "compras")
    public void Test2() {
        System.out.println("Test 2 mMthod");

    }

    @Test(groups = "login")
    public void Test3() {
        System.out.println("Test 3 mMthod");

    }

    @AfterSuite
    public void afterSuiteTest() {
        System.out.println("@AfterSuite");


    }

    @AfterClass
    public void afterClassTest() {
        System.out.println("@AfterClass");

    }

    @AfterTest
    public void afterTesting() {
        System.out.println("@AfterTest");

    }

    @AfterMethod
    public void afterMethodTest() {
        System.out.println("@AfterrMethod");


    }

}
