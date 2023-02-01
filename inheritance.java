class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return (n1 - n2) < 0 ? 0 : n1 - n2;
  }
}

public class inheritance {
  public static void main(String[] args) {
    // Calc c1 = new Calc();

    AdvCalc c1 = new AdvCalc();

    int r1 = c1.add(8, 7);
    int r2 = c1.sub(7, 3);

  
    System.out.println(r1+"and"+r2);
  }
}
