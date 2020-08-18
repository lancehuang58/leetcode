package leecode.arraylist;

/**
 * You are given a map in form of a two-dimensional integer grid where 1 represents land and 0
 * represents water.
 *
 * <p>Grid cells are connected horizontally/vertically (not diagonally). The grid is completely
 * surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 *
 * <p>The island doesn't have "lakes" (water inside that isn't connected to the water around the
 * island). One cell is a square with side length 1. The grid is rectangular, width and height don't
 * exceed 100. Determine the perimeter of the island.
 *
 * <p>Input: [[0,1,0,0], [1,1,1,0], [0,1,0,0], [1,1,0,0]]
 *
 * <p>Output: 16
 */
public class IslandPerimeter463 {

  public static void main(String[] args) {
    Solution solution = new Solution();
    int perimeter =
        solution.islandPerimeter(
            new int[][] {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}});
    System.out.println("perimeter = " + perimeter);
  }

  private static class Solution {
    public int islandPerimeter(int[][] grid) {
      if (grid.length == 0) {
        return 0;
      }

      int result = 0;
      int conn = 0;
      for (int y = 0; y < grid.length; ++y) {
        for (int x = 0; x < grid[y].length; ++x) {
          if (grid[y][x] == 1) {
            result++;
          }
          System.out.println("y = " + y + ", " + "x = " + x);

          if (grid[y - 1][x] == 1) {
            System.out.println("y = " + y + ", " + "x+1 = " + (x + 1));
            conn++;
          }
          if (grid[y + 1][x] == 1) {
            System.out.println("y = " + y + ", " + "x+1 = " + (x + 1));
            conn++;
          }
          //          if (x > 0 && grid[y][x - 1] == 1) conn++;
          //          if (y < grid.length - 1 && grid[y + 1][x] == 1) conn++;
          //          if (y > 0 && grid[y - 1][x] == 1) conn++;
        }
      }
      System.out.println("conn = " + conn);
      return result * 4;
    }
  }
}
