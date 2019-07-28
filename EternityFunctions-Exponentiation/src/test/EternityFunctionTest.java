package test;

import static org.junit.Assert.*;

import main.EternityFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * test class for operations of eternity functions operands
 */
public class EternityFunctionTest {

  /**
   * instance of EternityFunction class
   */
  private EternityFunction eternityFunction;

  /**
   * setup method to initialize objects
   *
   * @throws Exception unhandled
   */
  @Before
  public void setUp() throws Exception {
    eternityFunction = new EternityFunction();
  }

  /**
   * teardown method to release objects
   *
   * @throws Exception unhandled
   */
  @After
  public void tearDown() throws Exception {
    eternityFunction = null;
  }

  /**
   * test if first operand is real number or not
   */
  @Test
  public void firstOperandUnRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656E");
    eternityFunction.actionPerformedByOperators("^");
    assertTrue(eternityFunction.isFirstNotRealNumber());
  }

  /**
   * test if first operand is real number or not
   */
  @Test
  public void firstOperandRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656");
    eternityFunction.actionPerformedByOperators("^");
    assertFalse(eternityFunction.isFirstNotRealNumber());
  }

  /**
   * test if second operand is real number or not
   */
  @Test
  public void secondOperandUnRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656^6526.25654E");
    eternityFunction.setOperator("^");
    eternityFunction.actionPerformedByEqualsOperator();
    assertTrue(eternityFunction.isSecondNotRealNumber());
  }

  /**
   * test if second operand is real number or not
   */
  @Test
  public void secondOperandRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656^6526.25654");
    eternityFunction.setOperator("^");
    eternityFunction.setFirstRealNumber(563248.2656);
    eternityFunction.setSecondRealNumber(6526.25654);
    eternityFunction.actionPerformedByEqualsOperator();
    assertFalse(eternityFunction.isSecondNotRealNumber());
  }

  /**
   * test if second operand is a negative number or not
   */
  @Test
  public void secondOperandNotANegativeNumber() {
    eternityFunction.setSecondRealNumber(-543543.43432);
    assertTrue(eternityFunction.isaNegativeValue());
  }

  /**
   * test if second operand is positive number or not
   */
  @Test
  public void secondOperandPositiveNumber() {
    eternityFunction.setSecondRealNumber(543543.43432);
    assertFalse(eternityFunction.isaNegativeValue());
  }

}