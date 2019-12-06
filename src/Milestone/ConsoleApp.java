package Milestone;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class ConsoleApp {

  public static void main(String[] args) {
    FileAccessService fileAccessService = new FileAccessService();
    AddressBook book = new AddressBook();


    /**
     * Add a contact to AddressBook including Photo and Location
     */
    System.out.println("Loading the address book with new contacts");

    book.getContacts().addAll(fileAccessService.readAllContacts(null));
    System.out.print("\n");

    /**
     * Display one contact using the contact number
     */
    book.displayContactById(1);
    /**
     * Edit and update any contact, photo or location
     */
    System.out.println("Person1 Phone number before update" + book.getContacts().get(0).getPhoneNumber());
    book.getContacts().get(0).setPhoneNumber("6158888222");
    System.out.println("Person1 Phone number after update" + book.getContacts().get(0).getPhoneNumber() + "\n");
    /**
     * Delete any of the items in the list
     */

    book.removeContact(book.getContacts().get(2));
    System.out.println("Check to see if Person3 still exists in address book using viewContacts().");
    book.showContacts();
    System.out.println();

    /**
     * Search for a contact by name, city and description, print to console
     */
    System.out.println("Search for a person by the name of " + book.getContacts().get(1).getName());
    book.searchByContactName("Jim");
    System.out.println("Search for a person by city of " + book.getContacts().get(1).getLocation().getCity());
    book.searchByContactCity("Queen Creek");
    System.out.println("Search for a person by description " +((PersonContact) book.getContacts().get(0)).getDescription());
    book.searchByDescription("Friend");

  }
}