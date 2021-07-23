package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Them_phan_tu_vao_mang;
import java.util.Scanner;

public class Them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[100];

        System.out.print("Mời bạn nhập số lượng phần tử mảng: ");
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            System.out.print("Mời bạn nhập phần tử thứ "+i +": ");
            arr[i]=input.nextInt();
        }

        System.out.print("Mời bạn nhập giá trị thêm vào: ");
        int value = input.nextInt();

        System.out.print("Mời bạn nhập vị trí: ");
        int index = input.nextInt();

        int newSL = add(arr,value,index,n);

        for (int i=0;i<newSL;i++){
            System.out.print(arr[i]);
        }

    }

    public static int add(int[] arr, int value, int index, int n){
        for (int i=n; i>index-1; i--){
            arr[i]=arr[i-1];
        }
        arr[index-1]=value;
        return n+1;
    }
}
