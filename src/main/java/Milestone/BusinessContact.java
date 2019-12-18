package Milestone;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class BusinessContact extends BaseContact {

private int openingHour;
private int closingHour;
private String websiteURL;

  public BusinessContact(String type, int contactId, String name, String phoneNumber, Photo photo, Location location, int openingHour, int closingHour, String websiteURL) {
    super(type, contactId, name, phoneNumber, photo, location);
    this.openingHour = openingHour;
    this.closingHour = closingHour;
    this.websiteURL = websiteURL;
  }

  public BusinessContact(){}

  public int getOpeningHour() {
    return openingHour;
  }

  public void setOpeningHour(int openingHour) {
    this.openingHour = openingHour;
  }

  public int getClosingHour() {
    return closingHour;
  }

  public void setClosingHour(int closingHour) {
    this.closingHour = closingHour;
  }

  public String getWebsiteURL() {
    return websiteURL;
  }

  public void setWebsiteURL(String websiteURL) {
    this.websiteURL = websiteURL;
  }

  @Override
  public String toString() {
    return "BusinessContact{" +
            "type=" + getType() +
            ", id=" + getContactId() +
            ", name='" + getName() + '\'' +
            ", phoneNumber='" + getPhoneNumber() + '\'' +
            ", photo=" + getPhoto() +
            ", location=" + getLocation() +
            ", openingHour=" + openingHour +
            ", closingHour=" + closingHour +
            ", websiteURL='" + websiteURL + '\'' +
            '}';
  }
}
