package ru.stqa.pft.sandbox;

/**
 * Created by dmaleksandrov on 16.03.2017.
 */
public class MyFirstProgram1 {

  public static void main(String[] args) {

    Point a = new Point();

      a.x = 5;

      a.y = 5;

    Point b = new Point();

      b.x = 6;

      b.y = 6;

    System.out.println("Расстояние между двумя точками = " + distance(a, b));

  }

  public static double distance(Point a, Point b) {

      return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));

  }
}
