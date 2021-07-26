package S1_Introduction_to_java_1.Bai_tap.Ung_dung_chuyen_doi_tien_te;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn chọn Chức năng: \n1: VN -> USD\n2: USD -> VN");
        int input = scanner.nextInt();
        if (input==1){
            System.out.println("MỜi bạn nhập số tiền cần chuyển: ");
            int many = scanner.nextInt();
            System.out.println("Số tiền đã chuyển là: "+ many/23000);
        }else {
            System.out.print("MỜi bạn nhập số tiền cần chuyển: ");
            int many = scanner.nextInt();
            System.out.print("Số tiền đã chuyển là: "+ many*23000);
        }
    }
}
