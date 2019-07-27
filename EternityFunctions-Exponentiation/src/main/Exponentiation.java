package main;

public class Exponentiation {

  private double firstRealNumber;

  private double secondRealNumber;

  public Exponentiation(double firstRealNumber, double secondRealNumber){
    this.firstRealNumber=firstRealNumber;
    this.secondRealNumber=secondRealNumber;
  }

  public double getFirstRealNumber() {
    return firstRealNumber;
  }

  public void setFirstRealNumber(double firstRealNumber) {
    this.firstRealNumber = firstRealNumber;
  }

  public double getSecondRealNumber() {
    return secondRealNumber;
  }

  public void setSecondRealNumber(double secondRealNumber) {
    this.secondRealNumber = secondRealNumber;
  }

  public double power() {
    double result = 1.0;
    result = powerBySquaring(result);
    final double base_fraction = this.secondRealNumber - (int) this.secondRealNumber;
    if (base_fraction > 0.1f) {
      final int result1 = (int) (Double.doubleToLongBits(this.firstRealNumber) >> 32);
      final int result2 = (int) (base_fraction * (result1 - 1072632447) + 1072632447);
      return result * Double.longBitsToDouble(((long) result2) << 32);
    }
    return result;
  }

  private double powerBySquaring(double result) {
    int exponent = (int) this.secondRealNumber;
    double base = this.firstRealNumber;
    while (exponent != 0) {
      if ((exponent & 1) != 0) {
        result *= base;
      }
      base *= base;
      exponent >>= 1;
    }
    return result;
  }
}
