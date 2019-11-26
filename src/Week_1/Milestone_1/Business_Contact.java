package Week_1.Milestone_1;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class Business_Contact {

public int openingHour;
public int closingHour;
public String websiteURL;

  public Business_Contact(int openingHour, int closingHour, String websiteURL) {
    this.openingHour = openingHour;
    this.closingHour = closingHour;
    this.websiteURL = websiteURL;
  }

  public Business_Contact(){}

  @Override
  public String toString() {
    return "Business_Contact{" +
            "openingHour=" + openingHour +
            ", closingHour=" + closingHour +
            '}';
  }
}
