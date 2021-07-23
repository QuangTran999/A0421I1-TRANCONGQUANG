package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Tim_GTNN_trong_mang;
import java.util.Scanner;

public class Tim_GTNN_trong_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Mời bạn nhập kích thước của mảng: ");
        int SIZE = input.nextInt();
        int[] arr = new int[SIZE];
        for (int i=0; i<SIZE; i++){
            System.out.print("Mời bạn nhập phần tử thứ "+i +": ");
            arr[i] = input.nextInt();
        }
        int min = arr[0];
        for (int i=0; i<SIZE; i++){
            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng: "+min);
    }
}
