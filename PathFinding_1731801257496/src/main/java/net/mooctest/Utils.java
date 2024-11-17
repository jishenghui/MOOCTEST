package net.mooctest;

class Utils {

  static void check(boolean b) {
    if (!b) {
      throw new RuntimeException();
    }
  }

  static void check(boolean b, String msg) {
    if (!b) {
      throw new RuntimeException(msg);
    }
  }

  static void check(boolean b, String format, Object... args) {
    if (!b) {
      throw new RuntimeException(String.format(format, args));
    }
  }

  static int mask(int nbit) {
    check(nbit >= 1 && nbit <= 32);
    return nbit == 32 ? -1 : (1 << nbit) - 1;
  }
}
