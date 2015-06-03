package practice04;

/**
 * 鳴き声認識装置のクラスです。
 * 
 * @author yusuke mabuchi
 *
 */
public class BarkRecognizer {

  /**
   * フィールド
   */
  private DogDoor door;

  /**
   * コンストラクタ
   * 
   * @param DogDoorのインスタンス
   */
  public BarkRecognizer(DogDoor door) {
    this.door = door;
  }

  /**
   * 許可された声か確認します。
   * 
   * @param Barkのインスタンス
   */
  public void recognize(Bark bark) {
    System.out.println("   BarkRecognizer: Heard a '" + bark.getSound() + "'");

    boolean isMatch = door.getAllowedBarks().stream()
        .anyMatch(b -> b.equals(bark));
    
    if (isMatch) {
      door.open();
    } else {
      System.out.println("この犬は許可されていません");
    }
  }
}
