class Exponentiation {
  double power(final double firstRealNumber, final double secondRealNumber) {
    double result = 1.0;
    int exponent = (int) secondRealNumber;
    double base = firstRealNumber;
    while (exponent != 0) {
      if ((exponent & 1) != 0) {
        result *= base;
      }
      base *= base;
      exponent >>= 1;
    }
    final double base_fraction = secondRealNumber - (int) secondRealNumber;
    if (base_fraction > 0.1f) {
      final int result1 = (int) (Double.doubleToLongBits(firstRealNumber) >> 32);
      final int result2 = (int) (base_fraction * (result1 - 1072632447) + 1072632447);
      return result * Double.longBitsToDouble(((long) result2) << 32);
    }
    return result;
  }
}
