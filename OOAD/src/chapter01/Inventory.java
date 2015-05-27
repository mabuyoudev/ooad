package chapter01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

  /**
   * メンバー変数
   */
  private List<Guitar> guitars;

  /**
   * コンストラクタ
   */
  public Inventory() {
    guitars = new LinkedList<Guitar>();
  }

  /**
   * Guitarオブジェクトをリストに追加
   * 
   * @param serialNumber
   * @param price
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
   */
  public void addGuitar(String serialNumber, double price, GuitarSpec spec) {
    Guitar guitar = new Guitar(serialNumber, price, spec);
    guitars.add(guitar);
  }

  /**
   * シリアル番号を元にギターを取得します
   * 
   * @param serialNumber
   *          シリアルナンバー
   * @return Guitarオブジェクト
   */
  public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext();) {
      Guitar guitar = i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  /**
   * ギターを検索します
   * 
   * @param searchGuitar
   * @return Guitarオブジェクト
   */
  public List<Guitar> search(GuitarSpec searchSpec) {
    List<Guitar> matchingGuitars = new LinkedList<>();
    
    guitars.stream()
        .filter(g -> g.getSpec().compare(searchSpec))
        .forEach(g -> matchingGuitars.add(g));
    
    return matchingGuitars;
  }
}
