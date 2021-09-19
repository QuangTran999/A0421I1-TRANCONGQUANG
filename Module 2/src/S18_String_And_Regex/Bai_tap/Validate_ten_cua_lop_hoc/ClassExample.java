package S18_String_And_Regex.Bai_tap.Validate_ten_cua_lop_hoc;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ClassExample {
    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4,}[GHIKLM]+$";

    ClassExample(){
    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
