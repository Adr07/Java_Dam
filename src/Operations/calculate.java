package Operations;

public class calculate {
  public int sum(int num1, int num2) {
    return num1 + num2;
  }
  public int rest(int num1, int num2) {
    return num1 + num2;
  }

  public int mult(int num1, int num2) {
    return num1 + num2;
  }
  public int div(int num1, int num2) {
    return num1 + num2;
  }

  public int pot(int num1, int exp) {
    
    for (int i = 2 ;i < exp ;i++){
      num1 *= num1;
    }
    return num1;
  }
}
