package edu.iit.cs445.spring22;

public class TestCreature extends Object {
  private static int CREATURE_COUNT = 6;
  private static int THING_COUNT = 10;

  public static void main(String[] args) {
    Thing[] things = new Thing[THING_COUNT];
    Creature[] creatures = new Creature[CREATURE_COUNT];

    creatures[0] = new Tiger("Simba");
    creatures[1] = new Ant("Slayer");
    creatures[2] = new Fly("Wasp");
    creatures[3] = new Bat("Mammalia");
    creatures[4] = new Tiger("Puma");
    creatures[5] = new Fly("Honey Bee");

    things[0] = new Thing("Banana");
    things[1] = new Thing("Honey");
    things[2] = new Thing("Sugar");
    things[3] = creatures[3];
    things[4] = new Thing("Book");
    things[5] = new Thing("Spoon");
    things[6] = creatures[5];
    things[7] = creatures[0];
    things[8] = creatures[4];
    things[9] = new Thing("Salt");

    System.out.println("Things:");
    System.out.println();
    for (Thing aThing : things) {
      System.out.println(aThing);
    }

    System.out.println();
    System.out.println("Creatures:");
    System.out.println();
    for (Creature creature : creatures) {
      System.out.println(creature);
    }
  }
}
