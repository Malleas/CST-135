package Milestone;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
  public List<BaseContact> readAllContacts(String fileName) throws IOException {
    File file = new File(fileName);
    Scanner scanner = new Scanner(file);

    ArrayList<BaseContact> contacts = new ArrayList<>();
    while (scanner.hasNextLine()) {
      String line = scanner.nextLine();
      String[] items = new String[15];
      items = line.split(",");
      String contactType = items[0];
      int contactId = Integer.valueOf(items[1]);
      String name = items[2];
      String phoneNumber = items[3];
      int photoId = Integer.valueOf(items[4]);
      String photoFileName = items[5];
      String photoDate = items[6];
      String photoDescription = items[7];
      String locationAddress = items[8];
      String city = items[9];
      String state = items[10];
      int zipCode = Integer.valueOf(items[11]);
      Photo photo = new Photo(photoId, photoFileName, photoDate, photoDescription);
      Location location = new Location(locationAddress, city, state, zipCode);
      if (items[0].equalsIgnoreCase( "Personal")) {
        String dateOfBirth = items[12];
        String contactDescription = items[13];
        PersonContact personContact = new PersonContact(contactType, contactId, name, phoneNumber, photo, location,
                dateOfBirth, contactDescription);
        contacts.add(personContact);
      } else if (items[0].equalsIgnoreCase( "Business")) {
        int openHour = Integer.valueOf(items[12]);
        int closeHour = Integer.valueOf(items[13]);
        String webUrl = items[14];
        BusinessContact businessContact = new BusinessContact(contactType, contactId, name, phoneNumber, photo,
                location, openHour, closeHour, webUrl);
        contacts.add(businessContact);
      }
    }
    return contacts;
  }

  @Override
  public void saveAllContacts(String fileName, List<BaseContact> contacts, boolean append) throws IOException {
    File file = new File(fileName);
    FileWriter fileWriter = new FileWriter(file, append);
    PrintWriter printWriter = new PrintWriter(fileWriter);
    printWriter.println(contactListToString(contacts));
    printWriter.close();

  }
public String contactListToString(List<BaseContact> contacts){
  String contactString = "";
    for(int i = 0; i<contacts.size();i++){
      if (contacts.get(i).getType().equalsIgnoreCase("Personal")) {
        contactString = contacts.get(i).getType() + "," + Integer.toString(contacts.get(i).getContactId()) + "," +
                contacts.get(i).getName() + "," + contacts.get(i).getPhoneNumber() + "," + Integer.toString(contacts.get(i).getPhoto().getPhotoId())
                + "," + contacts.get(i).getPhoto().getFileName() + "," + contacts.get(i).getPhoto().getDateOfPhoto() + "," +
                contacts.get(i).getPhoto().getDescription() + "," + contacts.get(i).getLocation().getStreetAddress() + "," +
                contacts.get(i).getLocation().getCity() + "," + contacts.get(i).getLocation().getState() + "," + contacts.get(i).getLocation().getZipCode()
                + "," + ((PersonContact) contacts.get(i)).getDateOfBirth() + "," + ((PersonContact) contacts.get(i)).getDescription() + "\r";
      }else if(contacts.get(i).getType().equalsIgnoreCase("Business")){
        contactString = contacts.get(i).getType() + "," + Integer.toString(contacts.get(i).getContactId()) + "," +
                contacts.get(i).getName() + "," + contacts.get(i).getPhoneNumber() + "," + Integer.toString(contacts.get(i).getPhoto().getPhotoId())
                + "," + contacts.get(i).getPhoto().getFileName() + "," + contacts.get(i).getPhoto().getDateOfPhoto() + "," +
                contacts.get(i).getPhoto().getDescription() + "," + contacts.get(i).getLocation().getStreetAddress() + "," +
                contacts.get(i).getLocation().getCity() + "," + contacts.get(i).getLocation().getState() + "," + contacts.get(i).getLocation().getZipCode()
                + "," + Integer.toString(((BusinessContact) contacts.get(i)).getOpeningHour()) + "," + Integer.toString(((BusinessContact) contacts.get(i)).getClosingHour())
                + "," + ((BusinessContact) contacts.get(i)).getWebsiteURL() + "\r";
      }
    }
  return contactString;
}

}
