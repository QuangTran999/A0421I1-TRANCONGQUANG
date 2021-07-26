package S3_Mang_va_phuong_thuc_trong_java_3.Thuc_hanh.Tim_GTNN_trong_mang_su_dung_method;

public class TimGTLNTrongMangSuDungPhuongThuc {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,-6,7,5};
        int index = minValue(arr);
        System.out.println("Vị trí GTNN trong mảng là: "+ index);
    }
    public static int minValue(int[] arr){
        int min = arr[0];
        int index = 0;
        for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                index = i+1;
            }
        }
        return index;
    }
}
