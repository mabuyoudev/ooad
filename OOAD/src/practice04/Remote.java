package practice04;

/**
 * リモコンのクラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class Remote {

  /**
   * フィールド
   */
  private DogDoor door;

  /**
   * コンストラクタ
   * 
   * @param DogDoorクラスのインスタンス
   */
  public Remote(DogDoor door) {
    this.door = door;
  }

  /**
   * リモコンのボタンが押されたときの処理
   */
  public void pressButton() {
    System.out.println("Pressing the remote control button...");
    if (door.isOpen()) {
      door.close();
    } else {
      door.open();
    }
  }
}
