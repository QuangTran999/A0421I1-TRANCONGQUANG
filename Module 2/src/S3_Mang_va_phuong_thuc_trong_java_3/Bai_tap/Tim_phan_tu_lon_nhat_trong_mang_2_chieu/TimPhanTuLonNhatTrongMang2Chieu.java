package S3_Mang_va_phuong_thuc_trong_java_3.Bai_tap.Tim_phan_tu_lon_nhat_trong_mang_2_chieu;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int[][] arr = {{1,4,5,2},{2,5,6,77}};
        int max = arr[0][0];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length;j++){
                if (max<arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
