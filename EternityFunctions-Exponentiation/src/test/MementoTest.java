package test;

import static org.junit.Assert.*;

import main.CareTaker;
import main.Originator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * test class for memento pattern to save state of the calculator application.
 */
public class MementoTest {

  /**
   * instance of Originator class.
   */
  private Originator originator;

  /**
   * instance of CareTaker class.
   */
  private CareTaker careTaker;

  /**
   * setup method to initialize objects.
   *
   * @throws Exception unhandled
   */
  @Before
  public void setUp() throws Exception {
    originator = new Originator();
    careTaker = new CareTaker();
  }

  /**
   * teardown method to release objects.
   *
   * @throws Exception unhandled
   */
  @After
  public void tearDown() throws Exception {
    originator = null;
    careTaker = null;
  }

  /**
   * test if the saved states of the calculator is correct using memento pattern.
   */
  @Test
  public void historyOfOperations() {
    originator.setState("1+2=3");
    originator.setState("1-2=-1");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("1*2=2");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("1/2=0.5");
    assertEquals("1/2=0.5", originator.getState());

    originator.getStateFromMemento(careTaker.get(0));
    assertNotEquals("1+2=3", originator.getState());
    assertEquals("1-2=-1", originator.getState());
    originator.getStateFromMemento(careTaker.get(1));
    assertEquals("1*2=2", originator.getState());
  }
}