package Operations;

public class Loops {
  public void While_loop(int num1, int num2) {
            while (num1 < num2) {
                num1 += num1;
                System.out.println("The firts number is now: " + num1);
            }
        };

        public void Switch_loop (int num1) {
          switch (num1) {
              case 1:
                  System.out.println("The number is 1");
                  break;
              case 2:
                  System.out.println("The number is 2");
                  break;
              default:
                  System.out.println("This happens if any case is true");
                  break;
          }
        };
}
