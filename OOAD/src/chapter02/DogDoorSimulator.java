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
    System.out.println("\nFidoが用を済ます...");
    
    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {}
    
    System.out.println("...しかしまだ中にいる");
    System.out.println("\nFidoが吠え始める");
    System.out.println("...そこでGinaがリモコンをつかむ");
    remote.pressButton();
    
    System.out.println("\nFidoが家の中に戻る...");
  }

}
