package Week_1.Milestone_1;

import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public interface DataAccessService {

  void readAllContacts(List<String> contactList);

  void saveAllContacts(List<String> contactList);


}
