package Week_1.Milestone_1;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class ConsoleApp {

  public static void main (String[] args){
    AddressBook addressBook = new AddressBook();
    Base_Contact base_contact = new Base_Contact() {
    };
    Business_Contact business_contact = new Business_Contact();
    DatabaseAccessService databaseAccessService = new DatabaseAccessService();
    FileAccessService fileAccessService = new FileAccessService();
    Location location = new Location();
    Person_Contact person_contact = new Person_Contact();
    Photo photo = new Photo();
  }
}
