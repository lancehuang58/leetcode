package leecode.arraylist;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class IslandPerimeter463Test {

  IslandPerimeter463 solution = new IslandPerimeter463();


  @Test
  public void test() {
    int r = solution.islandPerimeter(Constant.ISLAND);
    assertThat(r).isEqualTo(16);
  }
}
