import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        int x, id;
        String name;


        cinema cinema = new cinema();
        Scanner scanner = new Scanner(System.in);
        Movie movie1 = new Movie("the godfather         ", 160, 9.1);
        Movie movie2 = new Movie("fight club            ", 157, 9.5);
        Movie movie3 = new Movie("interstellar          ", 160, 9.9);
        Movie movie4 = new Movie("inception             ", 144, 9.3);
        Movie movie5 = new Movie("gucci                 ", 160, 9.1);
        Movie movie6 = new Movie("american psycho       ", 157, 9.5);
        Movie movie7 = new Movie("the batman arkham rise", 160, 9.9);
        cinema.addMovies(movie1);
        cinema.addMovies(movie2);
        cinema.addMovies(movie3);
        cinema.addMovies(movie4);
        cinema.addMovies(movie5);
        cinema.addMovies(movie6);
        cinema.addMovies(movie7);
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------

        do {
            System.out.println("welcome to MY cinema please register or log in");
            System.out.println("----------------------------------------------");

            System.out.println("enter 1 to register");
            System.out.println("enter 2 to log in");
            System.out.println("enter 3 to exit the application");
            x = scanner.nextInt();
            switch (x) {
                case 1:

                    case1();


                    break;
                case 2:
                    System.out.println("please enter your name");
                    name = scanner.next();
                    System.out.println("enter your id");
                    id = scanner.nextInt();
                    User log = new User(name, id);
                    log.checkLogin();
                    case1();
                    cinema.getcinema();


            }

        } while (x != 3);

    }

    public static void case1() throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.next();
        System.out.println("enter your id");
        int id = scanner.nextInt();
        User user = new User(name, id);
        while (user.checkAndRegister() == false||user.checkLogin()==true) {
            System.out.println("welcome " + name + " thank you for signing up");
            System.out.println("please choose one of the services below");
            System.out.println("----------------------------------------------");
            System.out.println();

            System.out.println("enter 1 to book a movie");
            System.out.println("enter 2 to access your previous reservation");
            System.out.println("enter 3 to exit");


            int x = scanner.nextInt();
            switch (x) {
                case 1:cinema get=new cinema();
                    get.getcinema();

            }
        }

    }


}