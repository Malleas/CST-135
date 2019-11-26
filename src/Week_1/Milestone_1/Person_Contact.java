package Week_1.Milestone_1;

import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class Person_Contact {

  public String dateOfBirth;
  public String description;
  public ArrayList<String> relatives;

  public Person_Contact() {
  }

  public Person_Contact(String dateOfBirth, String description, ArrayList<String> relatives) {
    this.dateOfBirth = dateOfBirth;
    this.description = description;
    this.relatives = relatives;
  }

  @Override
  public String toString() {
    return "Person_Contact{" +
            "dateOfBirth='" + dateOfBirth + '\'' +
            '}';
  }
}
