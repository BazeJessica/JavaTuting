
package tutorialpoint;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class PasswordCheck {
    private String username;
    private String password;

    private boolean valid;
    private String errorMessage;

    public PasswordCheck(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isValid() {
        return valid;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        var validator = login();

        System.out.println("""
                    Your password should be
                    at least 8 characters long
                    contain an uppercase letter
                    not contain a username
                    not the same as old password
                """);
                do{
                    var proposedPassword = validator.getProposedPassword();
                    validator.changePassword(proposedPassword);
        
                    if(!validator.isValid()){
                        System.out.println(validator.getErrorMessage());
                    }
        
                }while(!validator.isValid());
        
                System.out.println("The proposed password is valid");
        

    }

    public String getProposedPassword(){
        System.out.println("Enter your new password:");
        return scanner.nextLine();
    }


    public void changePassword(String newPassword){

        valid = true;
        errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
     }

     if(newPassword.equals(newPassword.toLowerCase())){
        valid = false;
        errorMessage += "\n Your password must include an uppercase letter.";
    }

    if(newPassword.matches("[a-zA-Z0-9 ]*")){
        valid = false;
        errorMessage += "\n Your password must include a special character (e.g. %,$[:).";
    }

    if(newPassword.toUpperCase().contains(username.toUpperCase())){
        valid = false;
        errorMessage += "\n Your password cannot contain your username.";
    }

    if(newPassword.equals(password)){
        valid = false;
        errorMessage += "\n Your password must be different from your current password.";
    }
}
     
    public static PasswordCheck login(){
        System.out.println("Enter your username");
        String username = scanner.nextLine();
        System.out.println("Enter your password");
        String password = scanner.nextLine();

        return new PasswordCheck(username,password);
    }
}
