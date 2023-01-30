
class Calculator {
  public int add(int n1,int n2) {
   
    int r = n1 + n2;
    return r;
  }
}

public class object_orented_first_Demo {
  public static void main(String[] args) {
    int num1 = 4;
    int num2 = 5;

    Calculator calc = new Calculator(); 

    int res = calc.add(num1, num2);
    
    System.out.println(res);
  }
}
