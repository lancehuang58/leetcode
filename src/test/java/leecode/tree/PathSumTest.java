package leecode.tree;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PathSumTest {

  PathSum solution;

  @Before
  public void setUp() throws Exception {
    solution = new PathSum();
  }

  @Test
  public void given_null_node_then_return_false() {
    boolean b = solution.hasPathSum(null, 0);
    assertFalse(b);
  }
}