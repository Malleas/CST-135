package Week2.Assignments.Assignment_8.base;

import java.math.BigDecimal;

/**
 * All work is created by Matt Sievers on 12-03-2019 for use in CST-105
 */
public class ShapeBase implements Shape {

  protected int width, height;
  protected String name;
  protected float base1, base2, radius;;

  public ShapeBase(int width, int height, String name) {
    this.width = width;
    this.height = height;
    this.name = name;
  }

  public ShapeBase(float base1, float base2, int height, String name) {
    this.height = height;
    this.base1 = base1;
    this.base2 = base2;
    this.name = name;
  }

  public ShapeBase(float radius, String name){
    this.radius = radius;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public float calculateArea() {
    return -1;
  }
}
