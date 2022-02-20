import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BatTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
  }

  @After
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void testMove() {
    Bat bat = new Bat("Redhead");
    bat.move();
    assertEquals("Redhead Bat is swooping through the dark.\n", outContent.toString());
  }

  @Test
  public void testFly() {
    Bat bat = new Bat("Redhead");
    bat.fly();
    assertEquals("Redhead Bat is swooping through the dark.\n", outContent.toString());
  }

  @Test
  public void testEat() {
    Bat bat = new Bat("Redhead");
    Thing aThing = new Thing("Banana");
    bat.eat(aThing);
    assertEquals("Redhead Bat won't eat a Banana.\n", outContent.toString());

    outContent.reset();

    Fly fly = new Fly("red");
    bat.eat(fly);
    assertEquals("Redhead Bat has just eaten a red Fly\n", outContent.toString());
  }
}
