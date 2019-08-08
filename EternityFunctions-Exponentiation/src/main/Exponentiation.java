package main;

/**
 * Represents the exponentiation function in a Calculator
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
public class Exponentiation {

  /**
   * The first operand of the operator
   */
  private double firstRealNumber;

  /**
   * The second operand of the operator
   */
  private double secondRealNumber;

  /**
   * Creates a exponentiation function using the operands
   *
   * @param firstRealNumber  The first operand of the operator
   * @param secondRealNumber The second operand of the operator
   */
  public Exponentiation(double firstRealNumber, double secondRealNumber) {
    this.firstRealNumber = firstRealNumber;
    this.secondRealNumber = secondRealNumber;
  }

  /**
   * Setter for the first operand
   *
   * @param firstRealNumber the first operand
   */
  public void setFirstRealNumber(double firstRealNumber) {
    this.firstRealNumber = firstRealNumber;
  }

  /**
   * Setter for the second operand
   *
   * @param secondRealNumber the second operand
   */
  public void setSecondRealNumber(double secondRealNumber) {
    this.secondRealNumber = secondRealNumber;
  }

  /**
   * Calculates the exponentiation function x^y using bitwise approximation method for the
   * fractional part
   *
   * @return power of two operands
   */
  public double power() {
    double result = 1.0;
    result = powerBySquaring(result);
    final double baseFraction = this.secondRealNumber - (int) this.secondRealNumber;
    if (baseFraction > 0.1f) {
      final int result1 = (int) (Double.doubleToLongBits(this.firstRealNumber) >> 32);
      final int result2 = (int) (baseFraction * (result1 - 1072632447) + 1072632447);
      return result * Double.longBitsToDouble(((long) result2) << 32);
    }
    return result;
  }

  /**
   * Calculates the exponentiation function using squaring method for the non-fractional part
   *
   * @param power power of two operands
   * @return power of two operands
   */
  private double powerBySquaring(double power) {
    int exponent = (int) this.secondRealNumber;
    double base = this.firstRealNumber;
    while (exponent != 0) {
      if ((exponent & 1) != 0) {
        power *= base;
      }
      base *= base;
      exponent >>= 1;
    }
    return power;
  }
}
