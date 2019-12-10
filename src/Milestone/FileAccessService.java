package Milestone;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class FileAccessService implements DataAccessService {

  private List<BaseContact> contacts = new ArrayList<>();

  // @Override
  // public List<BaseContact> readAllContacts(String path, Charset encoding) throws IOException {
  //   byte[] encoded = Files.readAllBytes(Paths.get(path));
  //   String readString = new String(encoded, encoding);
  //   String[] strArray = readString.split(",");
  //   for ( contact : strArray) {
  //     //if(typeString)
  //   }
  // }

  @Override
  public List<BaseContact> readAllContacts(String fileName)  {
    List<BaseContact> listOfContacts = new ArrayList<BaseContact>();
    Location loc1 = new Location("111 Hill St.", "Nashville", "TN", 37214);
    Location loc2 = new Location("222 Farm St.", "Queen Creek", "AZ", 85297);
    Photo photo1 = new Photo(1, "Milestone/photos/Male_Headshot1.jpeg", "04/05/2019", "Headshot");
    PersonContact person1 = new PersonContact();
    person1.setContactId(1);
    person1.setName("Bob");
    person1.setDateOfBirth("01/01/1980");
    person1.setDescription("Friend");
    person1.setPhoneNumber("4801111111");
    person1.setPhoto(photo1);
    person1.setLocation(loc1);
    listOfContacts.add(person1);

    /**
     * create person 2 to add to person1 "relatives". This is a relationship
     * established between one PersonContact and another contact.
     */

    PersonContact person2 = new PersonContact();
    person2.setName("Jim");
    person2.setContactId(2);
    person2.setDateOfBirth("02/04/1983");
    person2.setDescription("Brother to Bob");
    person2.setPhoneNumber("6237877777");
    person2.setLocation(loc2);
    // person2.setContacts(person1);
    listOfContacts.add(person2);

    /**
     * Adding third contact
     */

    PersonContact person3 = new PersonContact();
    person3.setName("Janet");
    person3.setContactId(3);
    person3.setDateOfBirth("12/25/1972");
    person3.setDescription("Sister to Bob");
    person3.setPhoneNumber("602-111-1111");
    person3.setLocation(loc1);
    listOfContacts.add(person3);

    return listOfContacts;
  }

  @Override
  public void saveAllContacts(List<BaseContact> contacts) {

  }

  public void showContacts(String fileName) throws FileNotFoundException {
    for (BaseContact contact : readAllContacts(fileName)) {
      System.out.println(contact);
    }
  }


}
