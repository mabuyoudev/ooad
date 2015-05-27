package chapter01;

import java.util.List;

public class FindGuitarTester {

  public static void main(String[] args) {
    Inventory inventory = new Inventory();
    initializeInventory(inventory);

    GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);

    List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

    if (!matchingGuitars.isEmpty()) {
      System.out.println("Erin, you might like these guitars:");
      for (Guitar guitar : matchingGuitars) {
        GuitarSpec spec = guitar.getSpec();
        System.out.println(" We have a " + spec.getBuilder() + " "
            + spec.getModel() + " " + spec.getType() + " guitar:\n "
            + spec.getBackWood() + " back and sides,\n " + spec.getTopWood()
            + " top.\n You can have it for only $" + guitar.getPrice()
            + "!\n ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }

  }

  public static void initializeInventory(Inventory inventory) {
    GuitarSpec spec = new GuitarSpec(Builder.FENDER, "Stratocastor",
        Type.ELECTRIC, Wood.ALDER, Wood.ALDER, 6);
    inventory.addGuitar("V95693", 1499.95, spec); 
    inventory.addGuitar("V9512", 1549.95, spec);
  }
}
