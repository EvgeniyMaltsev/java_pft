package ru.stqa.pft.sandbox;

import homework2.Point;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

  @Test
  public void testPoint() {
    Point p1 = new Point(1, 2);
    Point p2 = new Point(2, 1);
    Assert.assertEquals(p1.distance(p2), 1.4142135623730951);

  }

}