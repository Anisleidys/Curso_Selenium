package Clase5;

import org.testng.annotations.*;

public class Ejercicio_1 {

    @BeforeTest
    public void test1(){
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    public void test2(){
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public void test3(){
        System.out.println("@BeforeMethod");
    }

    @Test
    public void test4(){
        System.out.println("Ejecutando prueba 1");
    }
    @Test
    public void test5(){
        System.out.println("Ejecutando prueba 2");
    }

    @AfterTest
    public void test6(){
        System.out.println("@AfterTest");
    }

    @AfterClass
    public void test7(){
        System.out.println("@AfterClass");
    }

    @AfterMethod
    public void test8(){
        System.out.println("@AfterMethod");
    }






}
