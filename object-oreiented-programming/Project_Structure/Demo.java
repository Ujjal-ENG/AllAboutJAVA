package Project_Structure;

import Project_Structure.Tools_Package.Calc;

public class Demo {
  public static void main(String[] args) {

    Calc c1 = new Calc();
    c1.show();
    int r1 = c1.add(8, 7);
    int r2 = c1.sub(3, 7);

    System.out.println(r1+" "+r2);
  }
}
