package S18_String_And_Regex.Bai_tap.Validate_ten_cua_lop_hoc;

public class ClassExampleTest {
    public static final String[] validClass = new String[] { "C0318G", "A3455G"};
    public static final String[] invalidClass = new String[] { "M0318G","P0323A" };

    public static void main(String[] args) {
        ClassExample classExample = new ClassExample();

        for (String item : validClass) {
            System.out.println("Check name class " +item+" :" + classExample.validate(item));
        }

        for (String item : invalidClass) {
            System.out.println("Check name class " +item+" :" + classExample.validate(item));
        }
    }
}
