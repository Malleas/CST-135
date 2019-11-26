package Week_1.Milestone_1;

import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class DatabaseAccessService implements DataAccessService {
  @Override
  public void readAllContacts(List<String> contactList) {

  }

  @Override
  public void saveAllContacts(List<String> contactList) {

  }

  public String userName;
  public String password;
  public String location;
  public String port;

  public DatabaseAccessService(String userName, String password, String location, String port) {
    this.userName = userName;
    this.password = password;
    this.location = location;
    this.port = port;
  }

  public DatabaseAccessService(){}

  @Override
  public String toString() {
    return "DatabaseAccessService{" +
            "userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            ", location='" + location + '\'' +
            ", port='" + port + '\'' +
            '}';
  }

  public void createConnection(String userName, String password, String location, String port){
    //Create DB connection
  }
}
