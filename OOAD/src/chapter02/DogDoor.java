package chapter02;

import java.util.Timer;
import java.util.TimerTask;

import chapter03.Bark;

/**
 * 犬用ドアを動かすクラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class DogDoor {

  /**
   * フィールド
   */
  private boolean open;
  private Bark allowedBark;

  /**
   * コンストラクタ
   */
  public DogDoor() {
    this.open = false;
  }

  public void open() {
    System.out.println("犬用ドアが開く");
    open = true;

    final Timer timer = new Timer();
    timer.schedule(new TimerTask() {

      @Override
      public void run() {
        close();
        timer.cancel();
      }
    }, 5000);
  }

  public void close() {
    System.out.println("犬用ドアが閉まる");
    open = false;
  }

  public boolean isOpen() {
    return open;
  }

  public Bark getAllowedBark() {
    return allowedBark;
  }

  public void setAllowedBark(Bark allowedBark) {
    this.allowedBark = allowedBark;
  }

}
