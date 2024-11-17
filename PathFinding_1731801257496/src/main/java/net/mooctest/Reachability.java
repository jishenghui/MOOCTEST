package net.mooctest;

import static net.mooctest.Point.toPoint;

public class Reachability {

  public static boolean isReachable(int x1, int y1, int x2, int y2, Grid grid) {
    return isReachable(x1, y1, x2, y2, 1, grid);
  }

  public static boolean isReachable(int x1, int y1, int x2, int y2, int scale, Grid grid) {
    return getClosestWalkablePointToTarget(x1, y1, x2, y2, scale, grid) == toPoint(x2, y2);
  }

  public static long getClosestWalkablePointToTarget(int x1, int y1, int x2, int y2, Grid grid) {
    return getClosestWalkablePointToTarget(x1, y1, x2, y2, 1, grid);
  }

  public static long getClosestWalkablePointToTarget(
      int x1, int y1, int x2, int y2, int scale, Grid grid) {
    return getClosestWalkablePointToTarget(x1, y1, x2, y2, scale, grid, null);
  }

  public static long getClosestWalkablePointToTarget(
      int x1, int y1, int x2, int y2, int scale, Grid grid, Fence fence) {
    if (scale < 1) {
      throw new IllegalArgumentException("Illegal scale: " + scale);
    }

    if (fence != null && fence.isReachable(x1, y1, x2, y2)) {
      fence = null; // 后面都不用判断了
    }

    double cx1 = scaleDown(x1 + 0.5, scale);
    double cy1 = scaleDown(y1 + 0.5, scale);

    int gx1 = (int) cx1;
    int gy1 = (int) cy1;

    // 起始格就不可行走
    if (!grid.isWalkable(gx1, gy1)) {
      return toPoint(x1, y1);
    }

    final double cx2 = scaleDown(x2 + 0.5, scale);
    final double cy2 = scaleDown(y2 + 0.5, scale);

    final int gx2 = (int) cx2;
    final int gy2 = (int) cy2;

    // 在同一格
    if (gx1 == gx2 && gy1 == gy2) {
      if (fence != null && !fence.isReachable(x1, y1, x2, y2)) {
        return toPoint(x1, y1);
      }
      return toPoint(x2, y2);
    }

    // 水平直线
    if (y1 == y2) { // 绝对水平
      int inc = gx2 > gx1 ? 1 : -1;
      for (int gx = gx1 + inc; ; gx += inc) {
        if (!grid.isWalkable(gx, gy1)
            || (fence != null
                && !fence.isReachable(x1, y1, gx == gx2 ? x2 : scaleUp(gx, scale), y2))) {
          if (gx - inc == gx1) { // 第二格就不可走了，返回起始点
            return toPoint(x1, y1);
          }
          return toPoint(scaleUp(gx - inc, scale), y1); // 中间某一格不可行走了，保留y轴
        }
        if (gx == gx2) {
          return toPoint(x2, y2);
        }
      }
    }

    // 竖直直线
    if (x1 == x2) { // 绝对竖直
      int inc = gy2 > gy1 ? 1 : -1;
      for (int gy = gy1 + inc; ; gy += inc) {
        if (!grid.isWalkable(gx1, gy)
            || (fence != null
                && !fence.isReachable(x1, y1, x2, gy == gy2 ? y2 : scaleUp(gy, scale)))) {
          if (gy - inc == gy1) {
            return toPoint(x1, y1);
          }
          return toPoint(x1, scaleUp(gy - inc, scale));
        }
        if (gy == gy2) {
          return toPoint(x2, y2);
        }
      }
    }

    // 斜线的情况
    // y=k*x+b, k=dy/dx, b=y-k*x

    final double dx = cx2 - cx1;
    final double dy = cy2 - cy1;

    final double k = dy / dx;
    final double b = cy1 - k * cx1;

    final boolean stepX;
    final double addDx, addDy;

    if (Math.abs(dx) > Math.abs(dy)) { // 偏x轴，递增x
      stepX = true;
      addDx = dx > 0 ? 1 : -1;
      addDy = addDx * k;
    } else { // 偏y轴，递增y
      stepX = false;
      addDy = dy > 0 ? 1 : -1;
      addDx = addDy / k;
    }

    double cx = cx1;
    double cy = cy1;

    while (true) {
      cx += addDx;
      cy += addDy;

      int gx = (int) cx;
      int gy = (int) cy;

      if (stepX
          ? (addDx > 0 ? gx >= gx2 : gx <= gx2)
          : (addDy > 0 ? gy >= gy2 : gy <= gy2)) { // 最后一个点要保证精确相等
        gx = gx2;
        gy = gy2;
      }

      if (!grid.isWalkable(gx, gy)) {
        break;
      }

      if (gx != gx1 && gy != gy1) { // 格子的xy坐标都变了
        int x0 = dx > 0 ? gx : gx1;
        double y0 = k * x0 + b; // x为该格子的起始点时，y的坐标

        // 如果y0正好是个整数，表明该直线正好穿过格子的交叉点
        // 而当k>0，说明该直线又是个左下右上直线
        // 这种情况，该交叉点是属于右上格子额，所以没穿过其他格子，不用多余判断
        if (Math.rint(y0) != y0 || k < 0) {
          int gy0 = (int) y0;
          if (gy0 == gy) {
            if (!grid.isWalkable(gx1, gy)) {
              break;
            }
          } else {
            if (!grid.isWalkable(gx, gy1)) {
              break;
            }
          }
        }
      }

      if (gx == gx2 && gy == gy2) {
        if (fence != null && !fence.isReachable(x1, y1, x2, y2)) {
          break;
        }
        return toPoint(x2, y2);
      }

      if (fence != null && !fence.isReachable(x1, y1, scaleUp(cx, scale), scaleUp(cy, scale))) {
        break;
      }

      cx1 = cx;
      cy1 = cy;

      gx1 = gx;
      gy1 = gy;
    }

    // 因不可行走导致中断，倒退回上一个检查点并返回
    return scaleUpPoint(cx1, cy1, scale);
  }

  public static double scaleDown(double d, int scale) {
    return d / scale;
  }

  public static int scaleUp(int i, int scale) {
    return i * scale + scale / 2; // 大格的中心点
  }

  public static int scaleUp(double d, int scale) {
    return (int) (d * scale);
  }

  public static long scaleUpPoint(double x, double y, int scale) {
    return toPoint(scaleUp(x, scale), scaleUp(y, scale));
  }
}
