package test;

import static org.junit.Assert.*;

import main.EternityFunction;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class EternityFunctionTest {

  @Rule
  public final ExpectedException exception = ExpectedException.none();

  private EternityFunction eternityFunction;

  @Before
  public void setUp() throws Exception {
    eternityFunction=new EternityFunction();
  }

  @After
  public void tearDown() throws Exception {
    eternityFunction=null;
  }

  @Test
  public void firstOperandUnRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656E");
    eternityFunction.actionPerformedByOperators("^");
    assertTrue(eternityFunction.isFirstNotRealNumber());
  }

  @Test
  public void firstOperandRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656");
    eternityFunction.actionPerformedByOperators("^");
    assertFalse(eternityFunction.isFirstNotRealNumber());
  }

  @Test
  public void secondOperandUnRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656^6526.25654E");
    eternityFunction.setOperator("^");
    eternityFunction.actionPerformedByEqualsOperator();
    assertTrue(eternityFunction.isSecondNotRealNumber());
  }

  @Test
  public void secondOperandRealNumberCheck() {
    eternityFunction.setTextFieldResultsText("563248.2656^6526.25654");
    eternityFunction.setOperator("^");
    eternityFunction.setFirstRealNumber(563248.2656);
    eternityFunction.setSecondRealNumber(6526.25654);
    eternityFunction.actionPerformedByEqualsOperator();
    assertFalse(eternityFunction.isSecondNotRealNumber());
  }

  @Test
  public void secondOperandNotANegativeNumber(){
    eternityFunction.setSecondRealNumber(-543543.43432);
    assertTrue(eternityFunction.isaNegativeValue());
  }

  @Test
  public void secondOperandPositiveNumber(){
    eternityFunction.setSecondRealNumber(543543.43432);
    assertFalse(eternityFunction.isaNegativeValue());
  }

}