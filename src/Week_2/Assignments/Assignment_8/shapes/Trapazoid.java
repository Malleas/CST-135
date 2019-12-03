package Week_2.Assignments.Assignment_8.shapes;

import Week_2.Assignments.Assignment_8.base.ShapeBase;

import java.math.BigDecimal;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class Trapazoid extends ShapeBase {

  public Trapazoid(float base1, float base2, int height, String name) {
    super(base1, base2, height, name);
  }

  @Override
  public float calculateArea() {

    return ((base1 + base2)/2)*height;
  }
}
