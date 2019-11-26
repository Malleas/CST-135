package Week_1.Milestone_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class AddressBook {

  public ArrayList<String> contacts = new ArrayList<String>();

  public AddressBook(ArrayList<String> contacts) {
    this.contacts = contacts;
  }

  public AddressBook(){}

  @Override
  public String toString() {
    return "AddressBook{" +
            "contacts=" + contacts +
            '}';
  }

  public void addContact(String contact) {
    contacts.add(contact);
  }

  public void removeContact(String contact) {
    contacts.remove(contact);
  }

  public void displayContact(int index) {
    System.out.println(contacts.get(index));
  }

  public void sortContactsByName() {
    Collections.sort(contacts);
    System.out.println(contacts);
  }

  public String viewContact(String searchParameter) {
    for (String contact : contacts) {
      if (searchParameter == contact) {
        return contact;
      }
    }
    return "No contact found";
  }



}
