public class Main {
  public static void main(String[] args) {

    Music music = new Music();
    music.setTitle("Chop Suey");
    music.setArtist("System of a Down");
    music.setGenre("Rock");

    for (int i = 0; i < 1000; i++) {
      music.playAudio();
    }

    for (int i = 0; i < 50; i++) {
      music.likeAudio();
    }

    Podcast podcast = new Podcast();
    podcast.setTitle("JRE");
    podcast.setHost("Joe Rogan");

    for (int i = 0; i < 5000; i++) {
      podcast.playAudio();
    }

    for (int i = 0; i < 1000; i++) {
      podcast.likeAudio();
    }

    MyFavorites myFavorites = new MyFavorites();
    myFavorites.includes(podcast);
    myFavorites.includes(music);
  }
}