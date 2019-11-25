/**
 * Helpers (Sievers, 2019) CST-105 Helper classes for UUID's retrieved from
 * https://github.com/Malleas/cst_105/blob/master/src/Final_Project/Helpers/KeyGen.java
 */

package Helpers;
import java.util.UUID;
public class Keygen {

    public static String id() {
        UUID uuid = UUID.randomUUID();
        String key = uuid.toString();
        return key;
    }

}
