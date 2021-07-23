package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Tinh_tong_cac_so_o_duong_cheo_chinh;
import java.util.Scanner;

public class Tinh_tong_cac_so_o_duong_cheo_chinh {
    public static void main(String[] args) {
//        int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập SL ma trận vuông:");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.printf("Nhập phần tử hàng %d cột %d:",i+1,j+1);
                arr[i][j]=input.nextInt();
            }
        }
        int sum=0;
        for (int i=1; i<=arr.length; i++){
            sum = sum + arr[i-1][i-1];
        }
        System.out.println("Tổng đường chéo chính: "+sum);
    }
}
