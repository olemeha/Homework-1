import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class CreatureTest {

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
  public void testEat() {
    Creature creature = new Creature("Redhead") {
      @Override
      public void move() {}
    };

    creature.whatDidYouEat();
    assertEquals("Redhead  has had nothing to eat!\n", outContent.toString());
    outContent.reset();

    creature.eat(new Thing("Banana"));
    assertEquals("Redhead  has just eaten a Banana\n", outContent.toString());
    creature.eat(new Thing("Apple"));
    outContent.reset();

    creature.whatDidYouEat();
    assertEquals("Redhead  has eaten a Apple!\n", outContent.toString());
    outContent.reset();
  }
}
