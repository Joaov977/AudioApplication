public class Audio {

  private String title;
  private int totalPlays;
  private int totalLikes;
  private double rating;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getTotalPlays() {
    return totalPlays;
  }

  public int getTotalLikes() {
    return totalLikes;
  }

  public double getRating() {
    return rating;
  }

  public void playAudio() {
    this.totalPlays++;
  }

  public void likeAudio() {
    this.totalLikes++;

  }
}