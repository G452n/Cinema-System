public class Movie  {
    private String title;
    private int duration;
    private double rating;

    public Movie(String title, int duration,double rating){
        this.title=title;
        this.duration=duration;
        this.rating=rating;
    }
    public String getTitle(){
        return title;
    }
    public int getDuration(){
        return duration;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return(title+"\t"+ duration +"\t\t\t"+rating);

    }
}