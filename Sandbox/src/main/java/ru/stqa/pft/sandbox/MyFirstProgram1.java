package ru.stqa.pft.sandbox;

/**
 * Created by dmaleksandrov on 16.03.2017.
 */
public class MyFirstProgram1 {

  public static void main(String[] args) {

    Point a = new Point(5, 5);

    Point b = new Point(6, 6);

    System.out.println("Расстояние между двумя точками = " + b.distance(a));

  }
}
