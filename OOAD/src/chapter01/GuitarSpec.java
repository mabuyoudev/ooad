package chapter01;

/**
 * ギターの仕様に関するクラス
 * 
 * @author yusukemabuchi
 *
 */
public class GuitarSpec {

  /**
   * fields
   */
  private Builder builder;
  private String model;
  private Type type;
  private Wood backWood;
  private Wood topWood;
  private int numStrings;

  /**
   * Constructor
   * 
   * @param builder
   * @param model
   * @param type
   * @param backWood
   * @param topWood
   * @param numStrings
   */
  public GuitarSpec(Builder builder, String model, Type type, Wood backWood,
      Wood topWood, int numStrings) {
    super();
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
    this.numStrings = numStrings;
  }

  public Builder getBuilder() {
    return builder;
  }

  public String getModel() {
    return model;
  }

  public Type getType() {
    return type;
  }

  public Wood getBackWood() {
    return backWood;
  }

  public Wood getTopWood() {
    return topWood;
  }

  public int getNumStrings() {
    return numStrings;
  }

  /**
   * ギターの仕様が同じか比較します
   * 
   * @param spec
   *          GuitarSpecのインスタンス
   * @return true or false
   */
  public boolean compare(GuitarSpec spec) {
    // Builderを比較
    if (this.getBuilder() != spec.getBuilder()) {
      return false;
    }
    // modelを比較
    String model = spec.getModel().toLowerCase();
    if (model != null && !model.equals("")
        && (!model.equals(this.getModel().toLowerCase()))) {
      return false;
    }
    // Typeを比較
    if (this.getType() != spec.getType()) {
      return false;
    }
    // backWoodを比較
    if (this.getBackWood() != spec.getBackWood()) {
      return false;
    }
    // topWoodを比較
    if (this.getTopWood() != spec.getTopWood()) {
      return false;
    }
    // numStringsを比較
    if (this.getNumStrings() != spec.getNumStrings()) {
      return false;
    }
    return true;
  }
}
