package text_processing.validation_password;

public class ValidationPassword {

    // Current credentials
    // The static attributes userName and currentPassword are used for educational purposes only.
    private static String username = "jane_doe";
    private static String currentPassword = "passw0rd";


    public ValidationPassword(String newPassword){
        String current_password = ValidationPassword.currentPassword;
        if(validatePassword(newPassword)){
            ValidationPassword.currentPassword = newPassword;
            System.out.println("✅ Valid password. Password updated successfully!");
        }else{
            ValidationPassword.currentPassword = current_password;
            System.out.println("❌ Invalid password. Password remains unchanged.");
        }
    }
    private static boolean validatePassword(String newPassword) {


        /***************************************************
         *
         * Criteria:
         *   at least 8 characters long
         *   contains an uppercase letter
         *   contains a special character
         *   does not contain the username
         *   is not the same as the old password
         */
        if(newPassword.length() >= 8){
            if(hasUpper(newPassword)){
                if(hasSpecial(newPassword)){
                    if(hasUserName(username,newPassword)){
                        if(equalsOldPassword(currentPassword,newPassword)){
                            return true;
                        }
                    }
                }
            }
        }


        return false;
    }


    private static boolean hasUpper(String newPassword){
        for (int i = 0; i < newPassword.length(); i++) {
            char c = newPassword.charAt(i);
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasSpecial(String newPassword){
        for (int i = 0; i < newPassword.length(); i++) {
            char c = newPassword.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasUserName(String userName,String newPassword){
        String lowerUserName = userName.toLowerCase();
        String lowerNewPassword = newPassword.toLowerCase();

        if(lowerNewPassword.contains(lowerUserName)){
            return false;
        }

        return true;
    }

    private static boolean equalsOldPassword(String currentPassword,String newPassword){
        if(newPassword.equals(currentPassword)){
            return false;
        }
        return true;
    }

}
