import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FlyTest {

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
    Fly fly = new Fly("Redhead");
    fly.move();
    assertEquals("Redhead Fly is buzzing around in flight.\n", outContent.toString());
  }

  @Test
  public void testFly() {
    Fly fly = new Fly("Redhead");
    fly.fly();
    assertEquals("Redhead Fly is buzzing around in flight.\n", outContent.toString());
  }

  @Test
  public void testEat() {
    Fly fly = new Fly("Redhead");
    Thing aThing = new Thing("Banana");
    fly.eat(aThing);
    assertEquals("Redhead Fly has just eaten a Banana\n", outContent.toString());

    outContent.reset();

    Bat bat = new Bat("red");
    fly.eat(bat);
    assertEquals("Redhead Fly won't eat a red Bat.\n", outContent.toString());
  }
}
