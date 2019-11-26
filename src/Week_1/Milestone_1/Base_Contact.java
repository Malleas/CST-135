package Week_1.Milestone_1;

import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public abstract class Base_Contact {

  public int number;
  public String name;
  public String phoneNumber;
  public List<String> photos;
  public Location location = new Location();
  public Business_Contact business_contact = new Business_Contact();


  public Base_Contact() {
  }

  public Base_Contact(int number, String name, String phoneNumber, List<String> photos, Location location, Business_Contact business_contact) {
    this.number = number;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.photos = photos;
    this.location = location;
    this.business_contact = business_contact;
  }

  @Override
  public String toString() {
    return "Base_Contact{" +
            "number=" + number +
            '}';
  }
}
