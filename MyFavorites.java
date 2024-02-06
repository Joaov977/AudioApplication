public class MyFavorites {

  public void includes(Audio audio) {
    if (audio.getRating() >= 9) {
      System.out.println(audio.getTitle() + " is a great sucess, everyone is enjoying!");
    } else {
      System.out.println(audio.getTitle() + " is a good song, it's an option, many people are liking");
    }
  }
}