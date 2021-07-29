package javaaplication;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailformat {
    public static void main(String[] args){
        String email = "dimasamaulana30@.gmail.id";
        System.out.println(valEmail(email));
    }

    public static boolean valEmail (String input) {
        String emailRegex = "^[A-Z0-9._%+-]+@+\\.[A-Z0-9.-]+\\.[co.id && .id]{2,20}$";
        Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPat.matcher(input);
        return matcher.find();
    }
}
