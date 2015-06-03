package practice04;

/**
 * 犬の鳴き声クラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class Bark {

  /**
   * フィールド
   */
  private String sound;

  /**
   * コンストラクタ
   * 
   * @param sound
   */
  public Bark(String sound) {
    this.sound = sound;
  }

  /**
   * ゲッター
   * 
   * @return
   */
  public String getSound() {
    return this.sound;
  }

  /**
   * Barkオブジェクトを比較します。
   */
  public boolean equals(Object bark) {
    if (bark instanceof Bark) {
      Bark otherBark = (Bark) bark;
      if (this.sound.equalsIgnoreCase(otherBark.getSound())) {
        return true;
      }
    }
    return false;
  }
}
