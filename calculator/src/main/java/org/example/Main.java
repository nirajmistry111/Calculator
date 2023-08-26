package org.example;

import java.util.*;


public class Main{

    public static void main(String[] args) throws ZerodivisionException , GreaterInput, MultiNotAllowed, InvalidInput {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        while (flag) {
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            try {
                Calculation.Calculator(a, b);
            } catch (Exception e) {
                System.out.println(e);
                flag = false;
            }
        }
    }
}
