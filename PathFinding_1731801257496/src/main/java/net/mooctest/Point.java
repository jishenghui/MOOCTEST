package net.mooctest;

public class Point {

  public static int getX(long p) {
    return (int) (p >>> 32);
  }

  public static int getY(long p) {
    return (int) p;
  }

  public static long toPoint(int x, int y) {
    return (((long) x) << 32) | (y & 0xFFFFFFFFL);
  }
}
