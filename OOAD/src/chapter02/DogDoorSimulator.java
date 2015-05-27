package chapter02;

/**
 * DogDoorの確認用クラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class DogDoorSimulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);
    System.out.println("\nFidoが外に出たいと吠える");
    remote.pressButton();
    System.out.println("\nFidoが外に出る...");
    remote.pressButton();
    System.out.println("\nFidoが用を済ます...");
    remote.pressButton();
    System.out.println("\nFidoが家の中に戻る...");
    remote.pressButton();
  }

}
