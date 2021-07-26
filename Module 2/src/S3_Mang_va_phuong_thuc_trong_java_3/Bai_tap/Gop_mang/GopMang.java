package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Gop_mang;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];
        for (int i=0; i<a.length; i++){
            System.out.print("Mời bạn nhập phần tử thứ "+i+" của mảng 1: ");
            a[i] = input.nextInt();
            System.out.print("Mời bạn nhập phần tử thứ "+i+" của mảng 2: ");
            b[i] = input.nextInt();
        }
        for (int i=0; i<5; i++){
            c[i] = a[i];
            c[i+5] = b[i];
        }
        System.out.println("Gộp mảng: ");
        for (int i : c){
            System.out.print(i);
        }

    }
}
