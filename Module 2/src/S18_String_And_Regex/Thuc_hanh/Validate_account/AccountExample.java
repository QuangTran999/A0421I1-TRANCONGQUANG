package S18_String_And_Regex.Thuc_hanh.Validate_account;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static Matcher matcher;
    private static Pattern pattern;

    private static final String ACOUNT_REGEX = "^[_a-z0-9]{6,}$";

    AccountExample(){
        pattern = Pattern.compile(ACOUNT_REGEX);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
