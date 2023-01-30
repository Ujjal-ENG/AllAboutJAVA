class Computer {
  public void playMusic() {
    System.out.println("Music Playing.");
  }

  public String getMePen(int cost) {
    return "Pen is cost = "+cost;
  }


}


public class object_orented_second_Demo {
  public static void main(String[] args) {
    Computer obj = new Computer();

    obj.playMusic();

    String str = obj.getMePen(10);

    System.out.println(str);

  }
}
