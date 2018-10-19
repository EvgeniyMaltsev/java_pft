package homework2;

public class MainPoint {

  public static void main(String[] args) {
    Point pointA = new Point(1,2);
    Point pointB = new Point(2,1);

    System.out.println(Point.distance(pointA,pointB));
  }
}