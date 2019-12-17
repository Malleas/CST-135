package Week4.DQ;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * All work is created by Matt Sievers on 12-16-2019 for use in CST-105
 */
public class PlayMedia {

  public static void main(String[] args) {
    Movie movie1 = new Movie();
    Song song1 = new Song();

    movie1.title("6 Underground");
    movie1.genre("Action");
    movie1.type("DVD");
    movie1.setMainActor("Ryan Reynolds");
    movie1.setLengthInMins(120);

    song1.title("Paradise City");
    song1.setBandName("Guns N Roses");
    song1.genre("Rock");
    song1.type("MP3");
    song1.setTouring(false);



    movie1.play(movie1.getTitle());
    song1.play(song1.getSongTitle());
  }
}
