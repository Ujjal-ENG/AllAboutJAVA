
class A {
  public A() {
    System.out.println("In A");
  }
}

class B extends A {
  public B() {
    System.out.println("In B");
  }
}


public class another_oop_keyword {
  public static void main(String[] args) {
    B obj = new B();
  }
}
