package S1_Introduction_to_java_1.Thuc_hanh.Giai_phuong_trinh_bac_nhat;
import java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương tring c=ax+b:");
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập b: ");
        int b = scanner.nextInt();

        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        if (a!=0){
            int x = (c-b)/a;
            System.out.println("Nghiệm của phương trình là x: "+ x);
        }

    }
}
