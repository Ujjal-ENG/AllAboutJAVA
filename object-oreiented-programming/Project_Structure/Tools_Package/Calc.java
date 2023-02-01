package Project_Structure.Tools_Package;

public class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return (n1 - n2) < 0 ? 0 : n1 - n2;
  }
  
}
