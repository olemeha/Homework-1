public class Bat extends Creature implements Flyer {

  public Bat(String name) {
    super(name);
  }

  @Override
  public void move() {
    fly();
  }

  @Override
  public void fly() {
    System.out.println(this + " is swooping through the dark.");
  }

  @Override
  public void eat(Thing aThing) {
    if(aThing instanceof Creature) {
      super.eat(aThing);
    } else if (aThing != null) {
      System.out.println(this + " won't eat a " + aThing + ".");
    }
  }
}
