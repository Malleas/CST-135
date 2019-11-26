package Week_1.Milestone_1;

/**
 * All work is created by Matt Sievers on 11-26-2019 for use in CST-105
 */
public class Photo {

  public int photoId;
  public String fileName;
  public String dateOfPhoto;
  public String description;

  public Photo(int photoId, String fileName, String dateOfPhoto, String description) {
    this.photoId = photoId;
    this.fileName = fileName;
    this.dateOfPhoto = dateOfPhoto;
    this.description = description;
  }

  public Photo(){}

  @Override
  public String toString() {
    return "Photo{" +
            "photoId=" + photoId +
            '}';
  }
}
