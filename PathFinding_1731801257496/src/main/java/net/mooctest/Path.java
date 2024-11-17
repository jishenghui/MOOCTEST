package net.mooctest;

import java.util.Arrays;

import static net.mooctest.Point.toPoint;

public class Path {

   long[] ps;
   int size;

  public Path() {
    this.ps = new long[8];
  }

  void add(int x, int y) { // 从后向前加
    long p = toPoint(x, y);
    if (size >= ps.length) {
      grow(size + 1);
    }
    ps[size] = p;
    size++;
  }

  void remove() {
    size--;
  }

  public long get(int i) {
    assert i >= 0 && i < size;
    return ps[size - 1 - i];
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size < 2; // 至少两点才能构成一段路径
  }

  public void clear() {
    size = 0;
  }

  public void grow(int minCapacity) {
    int oldCapacity = ps.length;
    int newCapacity = oldCapacity + ((oldCapacity < 64) ? (oldCapacity + 2) : (oldCapacity >> 1));

    if (newCapacity < minCapacity) {
      newCapacity = minCapacity;
    }

    if (newCapacity < 0) {
      throw new RuntimeException("Overflow");
    }
    ps = Arrays.copyOf(ps, newCapacity);
  }
}
