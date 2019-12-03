package Week_2.Assignments.Assignment_8.shapes;

import Week_2.Assignments.Assignment_8.base.ShapeBase;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Circle extends ShapeBase {


  public Circle(float radius, String name) {
    super(radius, name);
  }

  @Override
  public float calculateArea() {
    return (float) (3.14*(radius*radius));
  }
}
