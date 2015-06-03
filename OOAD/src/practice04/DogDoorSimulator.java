package practice04;

public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    door.addAllowedBark(new Bark("ロー"));
    door.addAllowedBark(new Bark("ローーーー"));
    door.addAllowedBark(new Bark("ラル"));
    door.addAllowedBark(new Bark("ウー"));
    BarkRecognizer recognizer = new BarkRecognizer(door);

    // ハードウェアによる鳴き声検知をシミュレーションする
    System.out.println("Bruceが吠え出す.");
    recognizer.recognize(new Bark("ロー"));

    System.out.println("\nBruceが外に出る...");
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
    }

    System.out.println("\nBruceが用を済ます");
    System.out.println("...しかし外に閉め出される");

    // ハードウェアによる鳴き声検知をシミュレーションする(Bruce以外)
    Bark smallDogBark = new Bark("キャン");
    System.out.println("小さな犬が吠え出す");
    recognizer.recognize(smallDogBark);

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
    }

    // ハードウェアによる鳴き声検知を再びシミュレーションする
    System.out.println("Bruceが吠え出す");
    recognizer.recognize(new Bark("ローーーー"));

    System.out.println("\nBruceが中に戻る");
  }
}
