package Milestone;


import java.util.Scanner;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */

/**
 * Add a new contact. (Creating a new contact will also require creating the photo and address objects since these are properties of the contact.)
 * Show all contacts.
 * Show one contact given its ID number. Give the user the option to edit the contact currently being shown.
 * Edit a contact given its ID number.
 * Search the contacts array for contacts by any the contact properties (name, street, URL, etc.)
 * Exit the program.Submit all deliverables as directed by your instructor.
 */
public class ConsoleApp {

  public static int menu() {
    int selection;
    Scanner input = new Scanner(System.in);

    System.out.println("Please choose from the following:");
    System.out.println("---------------------------------");
    System.out.println("1 - Add Contact");
    System.out.println("2 - Show all contacts");
    System.out.println("3 - Show contact by ID");
    System.out.println("4 - Edit contact by ID");
    System.out.println("5 - Search contact by name");
    System.out.println("6 - Search contact by street");
    System.out.println("7 - Search contact by URL");
    System.out.println("8 - Exit");

    selection = input.nextInt();
    input.nextLine();
    return selection;

  }


  public static void createPersonContact() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter contact ID:");
    int contactId = input.nextInt();
    input.nextLine();
    System.out.println("Enter contact name:");
    String contactName = input.nextLine();
    System.out.println("Enter contact phone number:");
    String contactPhoneNumber = input.nextLine();
    System.out.println("Enter photo ID:");
    int contactPhotoId = input.nextInt();
    input.nextLine();
    System.out.println("Enter photo file name:");
    String contactPhotoFileName = input.nextLine();
    System.out.println("Enter date of photo");
    String contactPhotoDate = input.nextLine();
    System.out.println("Enter photo description");
    String contactPhotoDescription = input.nextLine();
    System.out.println("Enter street address");
    String contactStreetAddress = input.nextLine();
    System.out.println("Enter city");
    String contactCity = input.nextLine();
    System.out.println("Enter State");
    String contactState = input.nextLine();
    System.out.println("Enter zip code");
    int contactZipCode = input.nextInt();
    input.nextLine();
    System.out.println("Enter date of birth");
    String contactDOB = input.nextLine();
    System.out.println("Enter contact description");
    String contactDescription = input.nextLine();
    PersonContact personContact = new PersonContact();
    Photo photo = new Photo(contactPhotoId, contactPhotoFileName, contactPhotoDate, contactPhotoDescription);
    Location location = new Location(contactStreetAddress, contactCity, contactState, contactZipCode);
    personContact.setContactId(contactId);
    personContact.setName(contactName);
    personContact.setPhoneNumber(contactPhoneNumber);
    personContact.setPhoto(photo);
    personContact.setLocation(location);
    personContact.setDateOfBirth(contactDOB);
    personContact.setDescription(contactDescription);
  }

  public static void createBusinessContact() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter contact ID:");
    int contactId = input.nextInt();
    input.nextLine();
    System.out.println("Enter contact name:");
    String contactName = input.nextLine();
    System.out.println("Enter contact phone number:");
    String contactPhoneNumber = input.nextLine();
    System.out.println("Enter photo ID:");
    int contactPhotoId = input.nextInt();
    input.nextLine();
    System.out.println("Enter photo file name:");
    String contactPhotoFileName = input.nextLine();
    System.out.println("Enter date of photo");
    String contactPhotoDate = input.nextLine();
    System.out.println("Enter photo description");
    String contactPhotoDescription = input.nextLine();
    System.out.println("Enter street address");
    String contactStreetAddress = input.nextLine();
    System.out.println("Enter city");
    String contactCity = input.nextLine();
    System.out.println("Enter State");
    String contactState = input.nextLine();
    System.out.println("Enter zip code");
    int contactZipCode = input.nextInt();
    input.nextLine();
    System.out.println("Enter opening time");
    int contactOpenTime = input.nextInt();
    input.nextLine();
    System.out.println("Enter closing time");
    int contactCloseTime = input.nextInt();
    input.nextLine();
    System.out.println("Enter website URL");
    String contactURL = input.nextLine();
    BusinessContact businessContact = new BusinessContact();
    Photo photo = new Photo(contactPhotoId, contactPhotoFileName, contactPhotoDate, contactPhotoDescription);
    Location location = new Location(contactStreetAddress, contactCity, contactState, contactZipCode);
    businessContact.setContactId(contactId);
    businessContact.setName(contactName);
    businessContact.setPhoneNumber(contactPhoneNumber);
    businessContact.setPhoto(photo);
    businessContact.setLocation(location);
    businessContact.setOpeningHour(contactOpenTime);
    businessContact.setClosingHour(contactCloseTime);
    businessContact.setWebsiteURL(contactURL);
  }

  public static void updatePhoto(AddressBook book, int contactId) {
    Scanner input = new Scanner(System.in);
    System.out.println("Select the following to update:");
    System.out.println("1 - Photo Id");
    System.out.println("2 - File Name");
    System.out.println("3 - Photo Date");
    System.out.println("4 - Photo Description");
    int selection = input.nextInt();
    input.nextLine();
    switch (selection) {
      case 1:
        Scanner photoIdInput = new Scanner(System.in);
        System.out.println("Please provide updated ID:");
        int updatedId = photoIdInput.nextInt();
        book.getContacts().get(contactId - 1).getPhoto().setPhotoId(updatedId);
        break;
      case 2:
        Scanner fileNameInput = new Scanner(System.in);
        System.out.println("Please provide updated file name:");
        String updatedFileName = fileNameInput.nextLine();
        book.getContacts().get(contactId - 1).getPhoto().setFileName(updatedFileName);
        break;
      case 3:
        Scanner photoDateInput = new Scanner(System.in);
        System.out.println("Please provide updated date:");
        String updatedDate = photoDateInput.nextLine();
        book.getContacts().get(contactId - 1).getPhoto().setDateOfPhoto(updatedDate);
        break;
      case 4:
        Scanner photoDescInput = new Scanner(System.in);
        System.out.println("Please provide updated photo description:");
        String updatedDesc = photoDescInput.nextLine();
        book.getContacts().get(contactId - 1).getPhoto().setDescription(updatedDesc);
        break;
    }
  }

  public static void updateLocation(AddressBook book, int contactId) {
    Scanner input = new Scanner(System.in);
    System.out.println("Select the following to update:");
    System.out.println("1 - Street Address");
    System.out.println("2 - City");
    System.out.println("3 - State");
    System.out.println("4 - Zip Code");
    int selection = input.nextInt();
    input.nextLine();
    switch (selection) {
      case 1:
        Scanner streetInput = new Scanner(System.in);
        System.out.println("Please provide updated street address:");
        String updatedStreetAddress = streetInput.nextLine();
        book.getContacts().get(contactId - 1).getLocation().setStreetAddress(updatedStreetAddress);
        break;
      case 2:
        Scanner cityInput = new Scanner(System.in);
        System.out.println("Please provide updated city:");
        String updatedCity = cityInput.nextLine();
        book.getContacts().get(contactId - 1).getLocation().setCity(updatedCity);
        break;
      case 3:
        Scanner stateInput = new Scanner(System.in);
        System.out.println("Please provide updated state:");
        String updatedState = stateInput.nextLine();
        book.getContacts().get(contactId - 1).getLocation().setState(updatedState);
        break;
      case 4:
        Scanner zipInput = new Scanner(System.in);
        System.out.println("Please provide updated zip code:");
        int updatedZip = zipInput.nextInt();
        book.getContacts().get(contactId - 1).getLocation().setZipCode(updatedZip);
        break;
    }
  }

  public static void updateContact(AddressBook book, int contactId) {
    Scanner input = new Scanner(System.in);
    System.out.println("Select the following to update:");
    System.out.println("1 - Name");
    System.out.println("2 - Phone Number");
    System.out.println("3 - Photo");//need a nested switch case to update this class's properties
    System.out.println("4 - Location");//need a nested switch case to update this class's properties
    System.out.println("5 - Date of Birth");
    System.out.println("6 - Contact Description");
    System.out.println("7 - Opening Time");
    System.out.println("8 - Closing Time");
    System.out.println("9 - Website URL");

    int selection = input.nextInt();
    input.nextLine();
    switch (selection) {
      case 1:
        Scanner nameInput = new Scanner(System.in);
        System.out.println("Please provide updated name:");
        String upadteName = nameInput.nextLine();
        book.getContacts().get(contactId - 1).setName(upadteName);
        break;
      case 2:
        Scanner phoneInput = new Scanner(System.in);
        System.out.println("Please provide updated phone number:");
        String updatedPhone = phoneInput.nextLine();
        book.getContacts().get(contactId - 1).setPhoneNumber(updatedPhone);
        break;
      case 3:
        updatePhoto(book, contactId);
        break;
      case 4:
        updateLocation(book, contactId);
        break;
      case 5:
        Scanner dobInput = new Scanner(System.in);
        System.out.println("Please provide updated date of birth:");
        String updatedDoB = dobInput.nextLine();
        ((PersonContact) book.getContacts().get(contactId - 1)).setDateOfBirth(updatedDoB);
        break;
      case 6:
        Scanner contactDescInput = new Scanner(System.in);
        System.out.println("Please provide updated description of contact:");
        String updatedDesc = contactDescInput.nextLine();
        ((PersonContact) book.getContacts().get(contactId - 1)).setDescription(updatedDesc);
        break;
      case 7:
        Scanner openingTimeInput = new Scanner(System.in);
        System.out.println("Please provide updated opening time:");
        int updatedOpenTime = openingTimeInput.nextInt();
        ((BusinessContact) book.getContacts().get(contactId - 1)).setOpeningHour(updatedOpenTime);
        break;
      case 8:
        Scanner closingTimeInput = new Scanner(System.in);
        System.out.println("Please provide updated opening time:");
        int updatedClosingTime = closingTimeInput.nextInt();
        ((BusinessContact) book.getContacts().get(contactId - 1)).setClosingHour(updatedClosingTime);
        break;
      case 9:
        Scanner urlInput = new Scanner(System.in);
        System.out.println("Please provide updated opening time:");
        String updatedUrl = urlInput.nextLine();
        ((BusinessContact) book.getContacts().get(contactId - 1)).setWebsiteURL(updatedUrl);
        break;
      default:
        System.out.println("Invalid entry, please retry.");
    }
  }

  public static void main(String[] args) {
    FileAccessService fileAccessService = new FileAccessService();
    AddressBook book = new AddressBook();

    int userInput = menu();

    while (true) {
      switch (userInput) {

        case 1:
          Scanner typeInput = new Scanner(System.in);
          System.out.println("Please choose from the following:");
          System.out.println("---------------------------------");
          System.out.println("1 - Personal Contact");
          System.out.println("2 - Business Contact");
          System.out.println("3 - Back");

          int contactType = typeInput.nextInt();
          typeInput.nextLine();
          switch (contactType) {
            case 1:
              createPersonContact();
              break;
            case 2:
              createBusinessContact();
              break;
            case 3:
              break;
            default:
              System.out.println("Invalid choice, please try again.");

          }
          break;
        case 2:
          book.showContacts();
          break;
        case 3:
          Scanner input = new Scanner(System.in);
          System.out.println("Provide ID to display");
          int id = input.nextInt();
          input.nextLine();
          book.displayContactById(id);
          System.out.println("Would you like to edit this contact?");
          System.out.println("------------------------------------");
          System.out.println("1 - Yes");
          System.out.println("2 - No");
          int updateAnswer = input.nextInt();
          switch (updateAnswer) {
            case 1:
              updateContact(book, id);
              break;
            case 2:
              break;
            default:
              System.out.println("Invalid entry, please try again.");
          }
          break;
        case 4:
          Scanner editInput = new Scanner(System.in);
          System.out.println("Please provide an contact ID to update");
          int idToEdit = editInput.nextInt();
          updateContact(book, idToEdit);
          break;
        case 5:
          Scanner searchNameInput = new Scanner(System.in);
          System.out.println("Please provide a name to search for:");
          String searchName = searchNameInput.nextLine();
          book.searchContacts(searchName, null, null);
          break;
        case 6:
          Scanner searchCityInput = new Scanner(System.in);
          System.out.println("Please provide a city to search for:");
          String searchCity = searchCityInput.nextLine();
          book.searchContacts(null, searchCity, null);
          break;
        case 7:
          Scanner searchDescriptionInput = new Scanner(System.in);
          System.out.println("Please provide a URL to search for:");
          String searchDescription = searchDescriptionInput.nextLine();
          book.searchContacts(null, null, searchDescription);
          break;
        case 8:
          System.exit(0);
          break;
        default:
          System.out.println("Invalid entry, please try again.");
      }
    }


//  /**
//   * Add a contact to AddressBook including Photo and Location
//   */
//  System.out.println("Loading the address book with new contacts");

//  book.getContacts().addAll(fileAccessService.readAllContacts(null));
//  System.out.print("\n");

//  /**
//   * Display one contact using the contact number
//   */
//  book.displayContactById(1);
//  /**
//   * Edit and update any contact, photo or location
//   */
//  System.out.println("Person1 Phone number before update" + book.getContacts().get(0).getPhoneNumber());
//  book.getContacts().get(0).setPhoneNumber("6158888222");
//  System.out.println("Person1 Phone number after update" + book.getContacts().get(0).getPhoneNumber() + "\n");
//  /**
//   * Delete any of the items in the list
//   */

//  book.removeContact(book.getContacts().get(2));
//  System.out.println("Check to see if Person3 still exists in address book using viewContacts().");
//  book.showContacts();
//  System.out.println();

//  /**
//   * Search for a contact by name, city and description, print to console
//   */
//  System.out.println("Search for a person by the name of " + book.getContacts().get(1).getName());
//  book.searchByContactName("Jim");
//  System.out.println("Search for a person by city of " + book.getContacts().get(1).getLocation().getCity());
//  book.searchByContactCity("Queen Creek");
//  System.out.println("Search for a person by description " +((PersonContact) book.getContacts().get(0)).getDescription());
//  book.searchByDescription("Friend");

  }
}