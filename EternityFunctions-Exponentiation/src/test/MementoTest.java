package test;

import static org.junit.Assert.*;

import main.CareTaker;
import main.Originator;
import org.junit.After;
import org.junit.Before;

public class MementoTest {

  private Originator originator;

  private CareTaker careTaker;

  @Before
  public void setUp() throws Exception {
    originator=new Originator();
    careTaker=new CareTaker();
  }

  @After
  public void tearDown() throws Exception {
    originator=null;
    careTaker=null;
  }

  public void historyOfOperations(){
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