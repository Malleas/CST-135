package Week_2.DailyQuestions.W2DQ1;

/**
 * All work is created by Matt Sievers on 12-02-2019 for use in CST-105
 */
public class Vehicle {

  public String color;
  public int year;
  public boolean functional;

  public Vehicle(String color, int year, boolean functional) {
    this.color = color;
    this.year = year;
    this.functional = functional;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public boolean isFunctional() {
    return functional;
  }

  public void setFunctional(boolean functional) {
    this.functional = functional;
  }
}
