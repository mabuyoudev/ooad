package chapter02;

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

  /**
   * コンストラクタ
   */
  public DogDoor() {
    this.open = false;
  }

  public void open() {
    System.out.println("犬用ドアが開く");
    open = true;
  }

  public void close() {
    System.out.println("犬用ドアが閉まる");
    open = false;
  }

  public boolean isOpen() {
    return open;
  }
}
