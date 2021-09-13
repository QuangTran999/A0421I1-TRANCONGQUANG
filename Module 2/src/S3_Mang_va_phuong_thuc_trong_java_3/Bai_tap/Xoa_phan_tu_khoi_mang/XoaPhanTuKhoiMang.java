package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Xoa_phan_tu_khoi_mang;
import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        int n=6;
//        System.out.println(arr.length);
        System.out.print("Mời bạn nhập phần tử cần tìm: ");
        int value = input.nextInt();
        int index = 0;
        for (int i=0;i<n;i++){
            if (arr[i]==value){
                index = i;
            }
        }
        if (index!=0){
            for (int i =index;i<n+1;i++){
                arr[i] = arr[i+1];
            }
        }
        for (int i=0;i<n-1;i++){
            System.out.print(arr[i]);
        }
    }

}
