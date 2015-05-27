package chapter02;

/**
 * 犬用ドアを遠隔操作するクラスです。
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
   * @param door
   *          DogDoorクラスのインスタンス
   */
  public Remote(DogDoor door) {
    this.door = door;
  }

  public void pressButton() {
    if (door.isOpen()) {
      door.close();
    } else {
      door.open();
    }
  }
}
