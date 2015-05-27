package external2;

public class Jet extends Airplane {

  private static final int MULTIPIER = 2;

  public Jet() {
    super();
  }

  @Override
  public void setSpeed(int speed) {
    super.setSpeed(speed * MULTIPIER);
  }

  public void accelerate() {
    super.setSpeed(this.getSpeed() * 2);
  }
}
