import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

/**
 * Created by rickiecashwell on 3/20/17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Validator validate = new Validator();
        System.out.println("Enter an age: ");
        String input = scan.nextLine();
        try {
            Double.parseDouble(input);
            if(validate.validateAge(input)){
                System.out.println("That is a valid age");
            }
        }
        catch (NumberFormatException nfe){
            System.out.println("That's not a number");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }



}
