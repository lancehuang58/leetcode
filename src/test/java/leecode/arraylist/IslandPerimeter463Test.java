package leecode.arraylist;

import static org.junit.Assert.*;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IslandPerimeter463Test {

  IslandPerimeter463 solution;

  @Before
  public void init() {
    solution = new IslandPerimeter463();
  }

  @Test
  public void test() {
    int r = solution.islandPerimeter(Constant.ISLAND);
    Assert.assertThat(r, Is.is(16));
  }
}