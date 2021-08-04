package S5_AccessModifier_StaticMethod_StaticProperty.Bai_tap.Xay_dung_lop_chi_ghi_trong_java;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Quang");
        st.setClasses("C05");
    }
}
