package Week2.Assignments.Assignment_8.test;

import Week2.Assignments.Assignment_8.base.ShapeBase;
import Week2.Assignments.Assignment_8.shapes.Circle;
import Week2.Assignments.Assignment_8.shapes.Rectangle;
import Week2.Assignments.Assignment_8.shapes.Trapazoid;
import Week2.Assignments.Assignment_8.shapes.Triangle;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Test {

  public static void main(String[] args) {
    ShapeBase[] shapes = new ShapeBase[4];
    shapes[0] = new Rectangle(5,10,"Rectangle");
    shapes[1] = new Triangle(14, 3, "Triangle");
    shapes[2] = new Trapazoid(15,8, 4, "Trapazoid");
    shapes[3] = new Circle(4, "Circle");
    for(int i = 0; i < shapes.length; i++){
      displayArea(shapes[i]);
    }
  }

  private static void displayArea(ShapeBase shape) {
    System.out.println("The name of the shape is: " + shape.getName() + "\n" + "The area of the of the " + shape.getName()
     + " is " + shape.calculateArea() + "\n");
  }
}
