import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private String customerName;
    private int id;
    private boolean found = false;
    private File file = new File("user.txt");
    Scanner scanner=new Scanner(System.in);
    public User(String customerName, int id) {
        this.customerName = customerName;
        this.id = id;
    }
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------

    public boolean checkAndRegister() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            found = false;
            while ((line = br.readLine()) != null) {

                if (line.contains(customerName) && line.contains(String.valueOf(id))) {
                    found = true;
                    System.out.println("the user is already registered");
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------



        if (!found) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));){

                System.out.println("please enter your password\ttest");
                String password=scanner.nextLine();
                bw.write(customerName + "," + id +","+password+ "\n");
                bw.flush();

                System.out.println("User registered successfully.");

            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
            }
        }
        return found;
    }
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------
//        ----------------------------------------------------------------------------------

    public boolean checkLogin() throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            found = true;
            while ((line = br.readLine()) != null) {

                if (line.contains(customerName) && line.contains(String.valueOf(id))) {

                    System.out.println("please enter your password");
                    String password=scanner.nextLine();
                    if(line.contains(password)){
                        System.out.println("welcome "+customerName);
                        found =false;
                        break;
                    }
                    else{
                        System.out.println("Wrong password try again!!");
                        checkLogin();
                    }

                }
            }
        }catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return found;
    }

}