package S1_Introduction_to_java_1.Bai_tap.Hien_thi_loi_chao;
import java.util.Scanner;
public class Hien_thi_loi_chao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+name);
    }
}
