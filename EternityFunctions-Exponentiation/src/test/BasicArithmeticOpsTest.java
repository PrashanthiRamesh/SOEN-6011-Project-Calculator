package test;

import static org.junit.Assert.*;

import main.BasicArithmeticOps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BasicArithmeticOpsTest {

  private BasicArithmeticOps basicArithmeticOps;

  @Before
  public void setUp() throws Exception {
    basicArithmeticOps=new BasicArithmeticOps(0.0,0.0);
  }

  @After
  public void tearDown() throws Exception {
    basicArithmeticOps=null;
  }

  @Test
  public void add() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(23858.746752,basicArithmeticOps.add(),0);
  }

  @Test
  public void subtract() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(-23209.877888000003,basicArithmeticOps.subtract(),0);
  }

  @Test
  public void multiply() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(7635341.2500498025,basicArithmeticOps.multiply(),0);

  }

  @Test
  public void divide() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(23534.31232);
    assertEquals(0.01378559218508748,basicArithmeticOps.divide(),0);

  }

  @Test
  public void divideByZero() {
    basicArithmeticOps.setFirstRealNumber(324.434432);
    basicArithmeticOps.setSecondRealNumber(0);
    assertEquals(Double.parseDouble("Infinity"),basicArithmeticOps.divide(),0);

  }
}