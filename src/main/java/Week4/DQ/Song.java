package Week4.DQ;

import Week4.DQ.Playable;

/**
 * All work is created by Matt Sievers on 12-16-2019 for use in CST-105
 */
public class Song extends Playable implements CreateMedia{

  private String bandName;
  private String songTitle;
  private String genre;
  private String type;
  private boolean isTouring;

  @Override
  public void play(String title) {
    System.out.println("Playing a Song in Song Class with a title of: " + this.songTitle);
    System.out.println("By the band: " + this.bandName);
    System.out.println("This song is in the " + this.genre + " genre.");
    System.out.println("Type of media is: " + this.type);
    System.out.println("And the band is currently touring? " + this.isTouring);
    System.out.println("Preparing to play song, current status is: " + prepareToPlay(true));
  }

  @Override
  public boolean prepareToPlay(boolean isPlaying) {
    if(isPlaying == true){
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
this.songTitle = title;
  }

  public String getBandName() {
    return bandName;
  }

  public void setBandName(String bandName) {
    this.bandName = bandName;
  }

  public String getSongTitle() {
    return songTitle;
  }

  public void setSongTitle(String songTitle) {
    this.songTitle = songTitle;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public boolean isTouring() {
    return isTouring;
  }

  public void setTouring(boolean touring) {
    isTouring = touring;
  }
}
