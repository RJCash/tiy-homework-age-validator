/**
 * Created by rickiecashwell on 3/20/17.
 */
public class Validator {

    public boolean validateAge(String strInput) throws Exception{
            double input = 0;
            input = Double.parseDouble(strInput);
            if (strInput.contains(".")) {
                throw new Exception("Age must be an integer");
            }
            if (input > 115) {
               throw new Exception("You are not over 115");
           }else if (input < 18) {
               throw new Exception("You have to be over 18");
           }else if((input < 0)){
               throw new Exception("That's a lie!");
           }
           else
               return true;
           }
    }

