public class Exponentiation {

  //check code for -x^-y
  public double pow(final double a, final double b) {
    // exponentiation by squaring
    double r = 1.0;
    int exp = (int) b;
    double base = a;
    while (exp != 0) {
      if ((exp & 1) != 0) {
        r *= base;
      }
      base *= base;
      exp >>= 1;
    }
    final double b_faction = b - (int) b;
    if (b_faction > 0.1f) {
      System.out.println(b_faction);
      final int tmp = (int) (Double.doubleToLongBits(a) >> 32);
      final int tmp2 = (int) (b_faction * (tmp - 1072632447) + 1072632447);
      return r * Double.longBitsToDouble(((long) tmp2) << 32);
    } else {
      return r;
    }
  }

}
