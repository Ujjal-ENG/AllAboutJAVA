
class A {
  public A() {
    System.out.println("In A");
  }

  public A(int a) {
    System.out.println("In a paramenter");
  }
}

class B extends A {
  public B() {
    System.out.println("In B");
  }

  public B(int b) {
    super(b);
    System.out.println("In b parameter");
  }
  
}


public class another_oop_keyword {
  public static void main(String[] args) {
    B obj = new B(4);
  }
}
