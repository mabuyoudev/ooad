package chapter01;

public enum Wood {

  INDIAN_ROSEWOOK, BRAZILIAN_ROSEWOOD,
  MAHOGANY, MAPLE, COCOBOLO, CEDAR,
  ADIRONDACK, ALDER, SITKA;
  
  @Override
  public String toString() {
    switch (this) {
    case INDIAN_ROSEWOOK:
      return "indian_rosewood";
    case BRAZILIAN_ROSEWOOD:
      return "brazilian_rosewood";
    case MAHOGANY:
      return "mahogany";
    case MAPLE:
      return "maple";
    case COCOBOLO:
      return "cocobolo";
    case CEDAR:
      return "cedar";
    case ADIRONDACK:
      return "adirondack";
    case ALDER:
      return "alder";
    case SITKA:
      return "sitka";
    default:
      return null;
    }
  }
}
