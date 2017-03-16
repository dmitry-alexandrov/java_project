package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by dmaleksandrov on 16.03.2017.
 */
public class PointTests {

  @Test
  public void testDistance1() {

    Point a = new Point(5, 5);

    Point b = new Point(6, 6);

    Assert.assertEquals(b.distance(a), 1.4142135623730951);
  }

  @Test
  public void testDistance2() {

    Point a = new Point(7.0, 7.0);

    Point b = new Point(8.0, 8.0);

    Assert.assertEquals(b.distance(a), 1.4142135623730951);

  }
}
