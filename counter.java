 class Counter {

  static int count = 0;

  public void Counter() {

    count += 1;
    System.out.print("Count" + count);

  }
}

public class counter {
  public static void main(String[] args) {
    Counter counter1 = new Counter();

    Counter counter2 = new Counter();

    Counter counter3 = new Counter();
  }
}