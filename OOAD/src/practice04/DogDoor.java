package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 犬用ドアのクラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class DogDoor {

  /**
   * フィールド
   */
  private boolean open;
  private List<Bark> allowedBarks = new ArrayList<>();

  /**
   * コンストラクタ
   */
  public DogDoor() {
    this.open = false;
  }

  /**
   * ドアを開けるメソッド
   * ５秒で自動的に閉まります。
   */
  public void open() {
    System.out.println("The dog door opens.");
    open = true;

    final Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      public void run() {
        close();
        timer.cancel();
      }
    }, 5000);
  }

  /**
   * ドアを閉めるメソッド
   */
  public void close() {
    System.out.println("The dog door closes.");
    open = false;
  }

  /**
   * ゲッター
   * 
   * @return ドアが開いていればTrue
   *         閉まっていればFalseを返します。
   */
  public boolean isOpen() {
    return open;
  }

  /**
   * ListにBarkインスタンスを追加します。
   * 
   * @param Barkオブジェクトのインスタンス
   */
  public void addAllowedBark(Bark bark) {
    this.allowedBarks.add(bark);
  }

  /**
   * BarkのListを返します。
   * 
   * @return Bark型のList
   */
  public List<Bark> getAllowedBarks() {
    return this.allowedBarks;
  }
}
