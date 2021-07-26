package S2_Vong_lap_trong_java_2.Bai_tap.Hien_thi_cac_loai_hinh;
import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        while (choice!=0){
            System.out.println("1. Hình chử nhật:");
            System.out.println("2. Hình tam giác vuông:");
            System.out.println("3. Hình tam gia vuông top-left:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.print("Mời bạn nhập chiều dài: ");
                    int n = input.nextInt();
                    System.out.println("Mời bạn nhập chiều rộng: ");
                    int m = input.nextInt();
                    for (int i=0;i<m;i++){
                        for (int j=0;j<n;j++){
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 2:
                    System.out.print("Mời bạn nhập chiều cao: ");
                    int h = input.nextInt();
                    for (int i=0;i<h;i++){
                        for (int j=0;j<=i;j++){
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.print("Mời bạn nhập chiều cao: ");
                    int k = input.nextInt();
                    for (int i=0;i<k;i++){
                        for (int j=i;j<k;j++){
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
            }
        }
    }
}
