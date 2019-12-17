package Milestone;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public interface DataAccessService {

  List<BaseContact> readAllContacts(String fileName);

  void saveAllContacts(List<BaseContact> contacts);


}
//