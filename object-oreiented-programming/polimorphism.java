class Human {
  private int age = 22;
  private String name = "Ujjal";

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

  public void setAge(int a) {
    age = a;
  }

  public void setName(String n) {
    name = n;
  }
}


public class polimorphism {
  public static void main(String[] args) {
    Human h1 = new Human();

    h1.setAge(24);
    h1.setName("Ador");

    System.out.println(h1.getAge());
    System.out.println(h1.getName());
  }
}
