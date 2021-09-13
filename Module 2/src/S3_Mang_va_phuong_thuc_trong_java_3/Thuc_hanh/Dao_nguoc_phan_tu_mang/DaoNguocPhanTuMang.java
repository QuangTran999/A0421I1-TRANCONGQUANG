package S3_Mang_va_phuong_thuc_trong_java_3.Thuc_hanh.Dao_nguoc_phan_tu_mang;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Scanner;
public class DaoNguocPhanTuMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i=0;i<arr.length;i++){
            System.out.print("Mời bạn nhập phần tử thứ "+i +": ");
            arr[i]= input.nextInt();
        }
        int first = 0;
        int last = arr.length-1;
        while (first<last){
            int tem = arr[first];
            arr[first] = arr[last];
            arr[last] = tem;
            first++;
            last--;
        }
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
