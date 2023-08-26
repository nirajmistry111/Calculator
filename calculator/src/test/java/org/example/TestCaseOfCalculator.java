package org.example;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.example.Calculation.Calculator;


public class TestCaseOfCalculator {
    @BeforeClass
    public static void  car() throws GreaterInput {
        Calculation.Calculator(1,1);
        System.out.println("Before class is done ");
        System.out.println();
    }
    // a
    @Before()
    public void befire() throws GreaterInput {
        Calculation.Calculator(-1,-1);
    }


    @After()
    public void aftire() throws GreaterInput {
        System.out.println(" ");
        System.out.println("5 AND 5");
        Calculation.Calculator(5,5);
        System.out.println(" ");
    }




    @Test(expected = ZerodivisionException.class)
    public void addfun() throws GreaterInput {
        Calculator(0,0);
    }
//b
    @Test(expected = InvalidInput.class)
    public  void inval() throws GreaterInput {
        Calculator(8,9 );
    }
//c
   @Test(expected =  GreaterInput.class)
    public  void grtval() throws GreaterInput { Calculator(100001 , 100001);}
    //1

    public static void  bike() throws GreaterInput {
        Calculation.Calculator(5,6);
        System.out.println("After class is done ");
        System.out.println();
    }

}
