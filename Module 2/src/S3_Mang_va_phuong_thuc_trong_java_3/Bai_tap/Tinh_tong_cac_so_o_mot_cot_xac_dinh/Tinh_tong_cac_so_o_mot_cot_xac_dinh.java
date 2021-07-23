package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Tinh_tong_cac_so_o_mot_cot_xac_dinh;
import java.util.Scanner;

public class Tinh_tong_cac_so_o_mot_cot_xac_dinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[][] arr= {{1,2,3,4},{5,6,7,8}};
        System.out.print("Mời bạn nhập số hàng của mảng: ");
        int m = input.nextInt();
        System.out.print("Mời bạn nhập số cột của mảng: ");
        int n = input.nextInt();

        int[][] arr = new int[m][n];

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                System.out.print("Mời bạn nhấp phần tử cột thư "+i+" hàng thứ "+j+": ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.print("Mời bạn nhập cột cần tính tổng: ");
        int index = input.nextInt();
        int sum=0;

        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i][index+1];
            System.out.println(arr[i][index-1]);
        }
        System.out.println("Tổng cột là: "+ sum);
    }
}
