class A {
  public void show() {
    System.out.println("In Show From A");
  }

  public void config() {
    System.out.println("In A config method");
  }
}

class B extends A{
  
}




public class Method_Overriding {
  public static void main(String[] args) {
   B isA = new B();
   isA.show();
    isA.config();
  }
}
