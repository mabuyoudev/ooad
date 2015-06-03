package chapter03;

import chapter02.DogDoor;

public class BarkRecognizer {

  private DogDoor door;

  public BarkRecognizer(DogDoor door) {
    this.door = door;
  }

  public void recognize(Bark bark) {
    System.out.println(" BarkRecognizer: 検知-> '" +
        bark.getSound() + "'");
    
    if (door.getAllowedBark().equals(bark)) {
      door.open();
    } else {
      System.out.println("この犬は許可されていません");
    }
  }
}
