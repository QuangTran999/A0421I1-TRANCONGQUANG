package S18_String_And_Regex.Bai_tap.Validate_so_dien_thoai;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileExample {
    private static final String MOBILE_REGEX = "^\\(84\\)\\-\\(0[0-9]{9,}\\)";

    MobileExample(){
    }

    public static boolean validate(String regex){
        Pattern pattern = Pattern.compile(MOBILE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
