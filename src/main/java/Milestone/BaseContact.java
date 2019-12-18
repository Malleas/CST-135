package Milestone;

import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public abstract class BaseContact {

  private int contactId;
  private String name;
  private String phoneNumber;
  private Photo photo = new Photo();
  private Location location = new Location();
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getContactId() {
    return contactId;
  }

  public String getName() {
    return name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public Photo getPhoto() {
    return photo;
  }

  public Location getLocation() {
    return location;
  }

  public BaseContact() {
  }

  public void setContactId(int contactId) {
    this.contactId = contactId;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setPhoto(Photo photo) {
    this.photo = photo;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public BaseContact(String type, int contactId, String name, String phoneNumber, Photo photo, Location location) {
    this.type = type;
    this.contactId = contactId;
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.photo = photo;
    this.location = location;
  }

  @Override
  public String toString() {
    return "BaseContact{" +
            "type=" + type +
            ", id=" + contactId +
            ", name='" + name + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", photo=" + photo +
            ", location=" + location +
            '}';
  }
}
