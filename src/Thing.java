public class Thing extends Object {

  private final String name;

  public Thing(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    if(this.getClass() == Thing.class) {
      return name;
    } else {
      return name + " " + this.getClass().getSimpleName();
    }
  }
}
