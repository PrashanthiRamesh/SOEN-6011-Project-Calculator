package test;

import static org.junit.Assert.*;

import main.Exponentiation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExponentiationTest {

  private Exponentiation exponentiation;

  @Before
  public void setUp() throws Exception {
      this.exponentiation=new Exponentiation(0.0,0.0);
  }

  @After
  public void tearDown() throws Exception {
    this.exponentiation=null;
  }

  @Test
  public void RealNumberRaisedToZero() {
    exponentiation.setFirstRealNumber(5.698468);
    exponentiation.setFirstRealNumber(0);
    assertEquals(1.0,exponentiation.power(),0);
  }

  @Test
  public void RealNumberExceptZeroRaisedToOne() {
    exponentiation.setFirstRealNumber(72645.3625892);
    exponentiation.setSecondRealNumber(1);
    assertEquals(72645.3625892,exponentiation.power(),0);
  }

  @Test
  public void ZeroRaisedToZero() {
    exponentiation.setFirstRealNumber(0);
    exponentiation.setSecondRealNumber(0);
    assertEquals(1.0,exponentiation.power(),0);
  }

  @Test
  public void ZeroRaisedToRealNumber() {
    exponentiation.setFirstRealNumber(0);
    exponentiation.setSecondRealNumber(856954745.2545523);
    assertEquals(0.0,exponentiation.power(),0);
  }

  @Test
  public void NegativeRealNumberRaisedToOddRealNumber() {
    exponentiation.setFirstRealNumber(-4);
    exponentiation.setSecondRealNumber(7);
    assertEquals(-16384,exponentiation.power(),0);
  }

  @Test
  public void NegativeRealNumberRaisedToEvenRealNumber() {
    exponentiation.setFirstRealNumber(-4);
    exponentiation.setSecondRealNumber(8);
    assertEquals(65536,exponentiation.power(),0);
  }
}