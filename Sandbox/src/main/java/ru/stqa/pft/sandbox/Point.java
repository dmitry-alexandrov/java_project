package ru.stqa.pft.sandbox;

/**
 * Created by dmaleksandrov on 16.03.2017.
 */
public class Point {

  public double x;

  public double y;

    public Point(double x, double y) {

      this.x = x;

      this.y = y;

    }

  public double distance(Point a) {

    return Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2));

  }
}
