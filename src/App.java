//Operation class for arithmetics operations
// import Operations.*;

//Main Class App for Java Proyect

// import Operations.calculate;
// import Operations.Loops;
import java.util.Arrays;

//Para diccionarios
// Diccionarios
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // pblic varibles
        int num1 = 1;
        int num2 = 10;

        // Print Hello World!
        System.out.println("Hello, World!");

        // Create Class
        // calculate cal = new calculate();
        // Loops loops = new Loops();

        // Operations
        // int res = cal.pot(2, 3);
        // System.out.println("The result is: " + res);

        // Sentences
        // and (&&), or (||)

        if (num1 == num2) {
            System.out.println(true);
        } else {
            System.out.println("Is false");
        }

        // loops
        // loops.While_loop(num1, num2);
        // loops.Switch_loop(num1);

        // Arrays
        Object[] array_Objects = new Object[5];

        // It can store any type of data

        array_Objects[0] = 1;
        array_Objects[1] = "Manuel";
        array_Objects[2] = 2.35;
        array_Objects[3] = true;
        array_Objects[4] = 'a';

        // Print element and type
        // For each
        for (Object object : array_Objects) {
            System.out.println("The element " + object + " is type " + object.getClass().getSimpleName());
        }

        String[] array = { "Juan", "Luis", "María", "Carlos", "Ana" };

        boolean found = false;

        for (String name : array) {
            if (name.equals("Juan")) {
                found = true;
            }
        }

        if (found) {
            System.out.println("Juan is in the array");
        } else {
            System.out.println("Juan is not in the array");
        }

        Arrays.sort(array);
        for (String name : array) {
            System.out.println(name);
        }

        // Diccionarios

        Map<String, Integer> dictionary = new HashMap<>();

        dictionary.put("apple", 1);

        System.out.println(dictionary.entrySet());

        System.out.println("Value for apple: " + dictionary.get("apple"));
    }
}
