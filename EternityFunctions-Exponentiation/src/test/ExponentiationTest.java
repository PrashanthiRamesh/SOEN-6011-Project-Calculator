package test;

import static org.junit.Assert.*;

import main.Exponentiation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * test class to validate the exponentiation function
 */
public class ExponentiationTest {

  /**
   * instance of Exponentiation class
   */
  private Exponentiation exponentiation;

  /**
   * setup method to initialize objects
   *
   * @throws Exception unhandled
   */
  @Before
  public void setUp() throws Exception {
    this.exponentiation = new Exponentiation(0.0, 0.0);
  }

  /**
   * teardown method to release objects
   *
   * @throws Exception unhandled
   */
  @After
  public void tearDown() throws Exception {
    this.exponentiation = null;
  }

  /**
   * test if x^0=1
   */
  @Test
  public void realNumberRaisedToZero() {
    exponentiation.setFirstRealNumber(5.698468);
    exponentiation.setFirstRealNumber(0);
    assertEquals(1.0, exponentiation.power(), 0);
  }

  /**
   * test if x^1=x
   */
  @Test
  public void realNumberExceptZeroRaisedToOne() {
    exponentiation.setFirstRealNumber(72645.3625892);
    exponentiation.setSecondRealNumber(1);
    assertEquals(72645.3625892, exponentiation.power(), 0);
  }

  /**
   * test if 0^0=1
   */
  @Test
  public void zeroRaisedToZero() {
    exponentiation.setFirstRealNumber(0);
    exponentiation.setSecondRealNumber(0);
    assertEquals(1.0, exponentiation.power(), 0);
  }

  /**
   * test if 0^y=0
   */
  @Test
  public void zeroRaisedToRealNumber() {
    exponentiation.setFirstRealNumber(0);
    exponentiation.setSecondRealNumber(856954745.2545523);
    assertEquals(0.0, exponentiation.power(), 0);
  }

  /**
   * test if -x^(odd)y =-result
   */
  @Test
  public void negativeRealNumberRaisedToOddRealNumber() {
    exponentiation.setFirstRealNumber(-4);
    exponentiation.setSecondRealNumber(7);
    assertEquals(-16384, exponentiation.power(), 0);
  }

  /**
   * test if -x^(even)y=+result
   */
  @Test
  public void negativeRealNumberRaisedToEvenRealNumber() {
    exponentiation.setFirstRealNumber(-4);
    exponentiation.setSecondRealNumber(8);
    assertEquals(65536, exponentiation.power(), 0);
  }
}