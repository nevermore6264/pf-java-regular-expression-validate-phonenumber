import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final Pattern pattern = Pattern.compile("^[(][0-9]{2}[)]-[(][0][0-9]{9}[)]+$");

    public static boolean validateClass(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println(validateClass("(84)-(0978489648)"));
        System.out.println(validateClass("(a8)-(22222222)"));
    }
}

