package main;

/**
 * Represents basic arithmetic operations like Addition, Subtraction, Multiplication and Division in a Calculator
 *
 * @author Prashanthi Ramesh
 * @version 1.0
 * @since 2019-07-26
 */
public class BasicArithmeticOps {

  /**
   * The first operand of the operator
   */
  private double firstRealNumber;

  /**
   * The second operand of the operator
   */
  private double secondRealNumber;

  /**
   * Creates a new basic arithmetic operation with the given operands
   * @param firstRealNumber The first operand of the operator
   * @param secondRealNumber The second operand of the operator
   */
  public BasicArithmeticOps(double firstRealNumber, double secondRealNumber) {
    this.firstRealNumber = firstRealNumber;
    this.secondRealNumber = secondRealNumber;
  }

  /**
   * Getter for the first operand
   * @return The first operand
   */
  public double getFirstRealNumber() {
    return firstRealNumber;
  }

  /**
   * Setter for the first operand
   * @param firstRealNumber The first operand
   */
  public void setFirstRealNumber(double firstRealNumber) {
    this.firstRealNumber = firstRealNumber;
  }

  /**
   * Getter for the second operand
   * @return The second operand
   */
  public double getSecondRealNumber() {
    return secondRealNumber;
  }

  /**
   * Setter for the second operand
   * @param secondRealNumber The second operand
   */
  public void setSecondRealNumber(double secondRealNumber) {
    this.secondRealNumber = secondRealNumber;
  }

  /**
   * Addition of two real numbers
   * @return the sum of first and second operand
   */
  public double add() {
    return this.firstRealNumber + this.secondRealNumber;
  }

  /**
   * Subtraction of two real numbers
   * @return the difference between first and second operand
   */
  public double subtract() {
    return this.firstRealNumber - this.secondRealNumber;
  }

  /**
   * Multiplication of two real numbers
   * @return the product of first and second operand
   */
  public double multiply() {
    return this.firstRealNumber * this.secondRealNumber;
  }

  /**
   * Division of two real numbers
   * @return the quotient of first and second operand
   */
  public double divide() {
    return this.firstRealNumber / this.secondRealNumber;
  }

}
