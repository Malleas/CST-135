package Milestone;

import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class PersonContact extends BaseContact {

  private String dateOfBirth;
  private String description;
  private List<PersonContact> contacts = new ArrayList<>();

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getDescription() {
    return description;
  }

  public List<PersonContact> getContacts() {
    return contacts;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setContacts(List<PersonContact> contacts) {
    this.contacts = contacts == null ? new ArrayList<>() : contacts;
  }

  public PersonContact(){}

  public PersonContact(String type, int contactId, String name, String phoneNumber, Photo photo, Location location,
                       String dateOfBirth, String description) {
    super(type, contactId, name, phoneNumber, photo, location);
    this.dateOfBirth = dateOfBirth;
    this.description = description;
    //this.contacts = contacts;
  }

  @Override
  public String toString() {
    return "PersonContact{" +
            "type=" + getType() +
            ". id=" + getContactId() +
            ", name='" + getName() + '\'' +
            ", phoneNumber='" + getPhoneNumber() + '\'' +
            ", photo=" + getPhoto() +
            ", location=" + getLocation() +
            ", dateOfBirth='" + dateOfBirth + '\'' +
            ", description='" + description + '\'' +
            ", contacts=" + contacts +
            '}';
  }
}
