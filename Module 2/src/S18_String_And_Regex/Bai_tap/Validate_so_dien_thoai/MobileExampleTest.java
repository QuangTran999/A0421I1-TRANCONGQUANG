package S18_String_And_Regex.Bai_tap.Validate_so_dien_thoai;

public class MobileExampleTest {
    public static final String[] validMobile = new String[] { "(84)-(0978489648)" };
    public static final String[] invalidMobile = new String[] { "(a8)-(22222222)" };

    public static void main(String[] args) {
        MobileExample mobileExample = new MobileExample();

        for (String mobile : validMobile) {
            System.out.println("Check name mobile "+mobile+": "+mobileExample.validate(mobile));
        }

        for (String mobile : invalidMobile) {
            System.out.println("Check name mobile "+mobile+": "+mobileExample.validate(mobile));
        }
    }
}
