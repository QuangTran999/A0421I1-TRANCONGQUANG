package S2_Vong_lap_trong_java_2.Thuc_hanh.Ung_dung_tinh_tien_lai_cho_vay;
import java.util.Scanner;

public class  ung_dung_tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền gửi: ");
        int tien_gui = scanner.nextInt();

        System.out.print("Nhập số lãi suất: ");
        int lai_suat = scanner.nextInt();

        System.out.print("Nhập số tháng gửi: ");
        int so_thang_gui = scanner.nextInt();

        int so_tien_lai = tien_gui * lai_suat/12 * so_thang_gui;
        System.out.println("Số tiền lãi là: "+so_tien_lai);
    }
}
