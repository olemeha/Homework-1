package edu.iit.cs445.spring22;

public abstract class Creature extends Thing {

  private Thing inStomach;

  public Creature(String name) {
    super(name);
    this.inStomach = null;
  }


public void eat(Thing aThing) {
    System.out.println(toString() + " has just eaten a " + aThing.toString());
    this.inStomach = aThing;
  }

  public abstract void move();

  public void whatDidYouEat() {
    if (inStomach == null) {
      System.out.println(toString() + " has had nothing to eat!");
    } else {
      System.out.println(toString() + " has eaten a " + inStomach.toString() + "!");
    }
  }
}
