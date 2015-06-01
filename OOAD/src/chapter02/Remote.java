package chapter02;

import java.util.Timer;
import java.util.TimerTask;

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
    System.out.println("リモコンボタンが押された...");
    if (door.isOpen()) {
      door.close();
    } else {
      door.open();
      final Timer timer = new Timer();
      timer.schedule(new TimerTask() {
        @Override
        public void run() {
          door.close();
          timer.cancel();
        }
      }, 5000);
    }
  }
}
