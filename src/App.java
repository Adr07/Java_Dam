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
        calculate cal = new calculate();
        Loops loops = new Loops();
        
        //Operations
        int res = cal.pot(2, 3);
        System.out.println("The result is: " + res);

        //Sentences
        // and (&&), or (||)
        
        if (num1 == num2) {
        System.out.println(true);
        } else {
            System.out.println("Is false");
        }

        // loops
        loops.While_loop(num1, num2);
        loops.Switch_loop(num1);
    }
}


