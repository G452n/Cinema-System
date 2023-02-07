import java.util.ArrayList;
import java.util.Scanner;

public class cinema {

    private ArrayList<Movie> movies=new ArrayList<>();
    private Movie test;
    private ArrayList <Integer> screen=new ArrayList<Integer>();
    private ArrayList <Integer> seats=new ArrayList<Integer>();
    Scanner scanner=new Scanner(System.in);
    public cinema() {
    }
    public void addMovies(Movie t) {
        this.test=t;
        movies.add(test);
    }

    public void setSeats() {
        for(int i=0;i<movies.size();i++) {
            seats.add(i,30);
            screen.add(i,i+1);
        }
    }

    public void RemoveMovie(Movie movie) {
        movies.remove(movie);
    }
    public  void getcinema(){
        System.out.println("movie title\t\tduration\t\trating\t\tnumber of seats availble\tnumber of the screen");
        System.out.println("--------------------------------------------------------------------------------------------");
        for(int i=0;i<movies.size();i++){
            setSeats();
            System.out.println((i+1)+"|"+movies.get(i) +"\t"+"\t\t\t\t\t"+ seats.get(i ) +"\t\t\t\t\t\t"+ screen.get(i )+"|");

            System.out.println("-------------------------------------------------------------------------------------------");

        }

    }



}