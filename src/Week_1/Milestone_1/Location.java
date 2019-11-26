package Week_1.Milestone_1;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class Location {


  public String streetAddress;
  public String city;
  public String state;
  public int zipCode;

  public Location(String streetAddress, String city, String state, int zipCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public Location(){}

  @Override
  public String toString() {
    return "Location{" +
            "zipCode=" + zipCode +
            '}';
  }
}
