class Mobile {
  String brand;
  int price;
  static String name;

  static {
    name = "SmartPhone";
  }

  Mobile(String brand, int price) {
    this.brand = brand;
    this.price = price;
  }

  public void show() {
    System.out.println("Brand Name: " + brand + "\nPrice: " + price + "\nName: " + name);
  }
  
}

public class Demo {
  public static void main(String[] args) {
    Mobile mb1 = new Mobile("Realme", 26500);
    mb1.show();
  }
}
