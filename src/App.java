//Operation class for arithmetics operations
// import Operations.*;

//Main Class App for Java Proyect

import Operations.calculate;
import Operations.Loops;


public class App {
    public static void main(String[] args) throws Exception {
        // pblic varibles
        int num1 = 1;
        int num2 = 10;

        //Print Hello World!
        System.out.println("Hello, World!");

        // Create Class
        OperationA operationA = new OperationA();
        Loops loops = new Loops();

        //Operations
        operationA.Arithmeticint(num1, num2);

        // loops
        loops.While_loop(num1, num2);
    }

     public static class OperationA {
        public void Arithmeticint (int num1, int num2) {
            //Arithmetic operation
            calculate cal = new calculate();
            int res = cal.pot(2, 3);

             System.out.println("The result is: " + res);
        };
    };

}


