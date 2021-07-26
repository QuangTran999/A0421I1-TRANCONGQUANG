package S2_Vong_lap_trong_java_2.Bai_tap.Hien_thi_20_SNT_dau_tien;

public class HienThi20SNTDauTien {
    public static void main(String[] args) {
        int count = 0;
        int countSNT = 0;
        for (int i=2;i<5000;i++){
            for (int j=1;j<i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==1){
                System.out.println(i + ", ");
                countSNT++;
            }
            if (countSNT==20){
                break;
            }
            count = 0;
        }
    }
}
