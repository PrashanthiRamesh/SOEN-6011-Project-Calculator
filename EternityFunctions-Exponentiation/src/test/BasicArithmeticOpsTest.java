package test;

import static org.junit.Assert.*;

import main.BasicArithmeticOps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Class for basic arithmetic operations like- add, sub, mul and div
 */
public class BasicArithmeticOpsTest {

  /**
   * instance of BasicArithmeticOps class
   */
  private BasicArithmeticOps basicArithmeticOps;

  /**
   * setup method to initialize objects
   *
   * @throws Exception unhandled
   */
  @Before
  public void setUp() throws Exception {
    basicArithmeticOps = new BasicArithmeticOps(0.0, 0.0);
  }

  /**
   * teardown method to release objects
   *
   * @throws Exception
   */
  @After
  public void tearDown() throws Exception {
    basicArithmeticOps = null;
  }

  /**
   * test method for addition operation
   */
  @Test
  public void add() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(23858.746752, basicArithmeticOps.add(), 0);
  }

  /**
   * test method for subtraction operation
   */
  @Test
  public void subtract() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(-23209.877888000003, basicArithmeticOps.subtract(), 0);
  }

  /**
   * test method for multiplication
   */
  @Test
  public void multiply() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(7635341.2500498025, basicArithmeticOps.multiply(), 0);
  }

  /**
   * test method for division
   */
  @Test
  public void divide() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(0.01378559218508748, basicArithmeticOps.divide(), 0);
  }

  /**
   * test method for division by zero
   */
  @Test
  public void divideByZero() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(0);
    assertEquals(Double.parseDouble("Infinity"), basicArithmeticOps.divide(), 0);
  }
}