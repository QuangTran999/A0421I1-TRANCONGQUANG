package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi;
import java.util.Scanner;

public class Dem_so_lan_xuat_hien_cua_ky_tu_trong_chuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Tran Cong Quang";
        char value = 'n';
        int count = 0;
        for (int i=0; i<str.length(); i++){
            if (value==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lượng ký tự "+value+" xuất hiện: "+count+" lần.");
    }
}
