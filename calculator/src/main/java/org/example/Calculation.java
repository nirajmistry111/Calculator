package org.example;

class Calculation {
    public static void Calculator(int a, int b) throws ZerodivisionException , GreaterInput, MultiNotAllowed, InvalidInput {
        if (a == 0 || b == 0) {
            throw new ZerodivisionException();

        }


        if (a == 8 && b == 9) {
            throw new InvalidInput();
        }
        if (a == 0 || b == 0) {
            throw new ZerodivisionException();

        }
        if( a > 100000 || b > 100000) {
            throw new GreaterInput();
        }
        if( a > 7000 || b > 7000){
            throw new MultiNotAllowed();
        }


        else {

            int addition = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            int division = a / b;

            System.out.println("Addition: " + addition);
            System.out.println("Subtraction: " + subtraction);
            System.out.println("Multiplication: " + multiplication);
            System.out.println("Division: " + division);
        }
    }

}
