package pp_adapter_ex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// pega conteúdo de outra // classes que ele está  sextendendo ou
// impplementando

public class Adapter implements EmailValida {

    public boolean isValidEmailAddress(String email) {
        boolean isEmailIdValid = false;
        if (email != null && email.length() > 0) {
            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                isEmailIdValid = true;
            }
        }
        return isEmailIdValid;
    }

}
