package S2_Vong_lap_trong_java_2.Bai_tap.Hien_thi_cac_SNT_nho_hon_100;

public class Hien_thi_SNT_nho_hon_100 {
    public static void main(String[] args) {
        int count = 0;
        int countSNT = 0;
        for (int i=2;i<100;i++){
            for (int j=1;j<i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==1){
                System.out.println(i + ", ");
            }
            count = 0;
        }
    }
}
