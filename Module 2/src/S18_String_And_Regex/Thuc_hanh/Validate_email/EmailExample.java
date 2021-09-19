package S18_String_And_Regex.Thuc_hanh.Validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);//?dùng để biên dịch EMAIL_REGEX.
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);//matcher(CharSequence input)	tạo một matcher khớp với đầu vào đã cho với mẫu.
        return matcher.matches();//boolean matches()   kiểm tra xem biểu thức chính quy có khớp với mẫu hay không.
    }
}
