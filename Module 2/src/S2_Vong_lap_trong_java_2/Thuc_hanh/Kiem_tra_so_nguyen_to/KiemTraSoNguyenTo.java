package S2_Vong_lap_trong_java_2.Thuc_hanh.Kiem_tra_so_nguyen_to;
import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số nguyên tố cần kiểm tra: ");
        int n = scanner.nextInt();
        int count = 0;
        if (n<2){
            System.out.println(n+" Không phải là số nguyên tố.");
        }else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            System.out.println(n);
            System.out.println(count);
            if (count == 0) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " Không phải là số nguyên tố.");
            }
        }
    }
}
