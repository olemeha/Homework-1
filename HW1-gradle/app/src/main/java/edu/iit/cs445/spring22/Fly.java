package edu.iit.cs445.spring22;

public class Fly extends Creature implements Flyer {
  public Fly(String name) {
    super(name);
  }

  @Override
  public void move() {
    fly();
  }

  @Override
  public void fly() {
    System.out.println(this + " is buzzing around in flight.");
  }

  @Override
  public void eat(Thing aThing) {
    if(aThing instanceof Creature) {
      System.out.println(this + " won't eat a " + aThing + ".");
    } else if (aThing != null) {
      super.eat(aThing);
    }
  }
}
