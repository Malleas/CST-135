package Week2.DailyQuestions.W2DQ1;

/**
 * All work is created by Matt Sievers on 12-02-2019 for use in CST-105
 */
public class FordVehicle extends Vehicle{


  public String make;
  public String model;
  public String type;

  public FordVehicle(String color, int year, boolean functional, String make, String model, String type) {
    super(color, year, functional);
    this.make = make;
    this.model = model;
    this.type = type;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
