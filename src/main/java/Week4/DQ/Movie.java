package Week4.DQ;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * All work is created by Matt Sievers on 12-16-2019 for use in CST-105
 */
public class Movie extends Playable implements CreateMedia {

  private String mainActor;
  private String title;
  private String genre;
  private String type;
  private int lengthInMins;


  @Override
  public void play(String title) {
    System.out.println("Playing a Movie in Movie Class with a title of: " + this.title);
    System.out.println("The Genre is: " + this.genre);
    System.out.println("The media type is: " + this.type);
    System.out.println("The main actor in the movie is: " + this.mainActor);
    System.out.println("Movie length is: " + this.lengthInMins);
    System.out.println("Preparing to play movie, current status is: " + prepareToPlay(true));
  }

  @Override
  public boolean prepareToPlay(boolean isPlaying) {
    if (isPlaying == true) {
      return true;
    }
    return false;
  }

  @Override
  public void type(String type) {
    this.type = type;
  }

  @Override
  public void genre(String genre) {
    this.genre = genre;
  }

  @Override
  public void title(String title) {
    this.title = title;
  }

  public String getMainActor() {
    return mainActor;
  }

  public void setMainActor(String mainActor) {
    this.mainActor = mainActor;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public int getLengthInMins() {
    return lengthInMins;
  }

  public void setLengthInMins(int lengthInMins) {
    this.lengthInMins = lengthInMins;
  }
}
