package net.mooctest;

class Cost {

  static final int COST_ORTHOGONAL = 5; // 1 * 5
  static final int COST_DIAGONAL = 7; // 1.4 * 5

  static int hCost(int x1, int y1, int x2, int y2) {
    return (Math.abs(x2 - x1) + Math.abs(y2 - y1)) * COST_ORTHOGONAL;
  }
}
