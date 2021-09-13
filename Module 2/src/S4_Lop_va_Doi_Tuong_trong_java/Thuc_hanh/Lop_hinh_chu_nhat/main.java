package S4_Lop_va_Doi_Tuong_trong_java.Thuc_hanh.Lop_hinh_chu_nhat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width:");
        int width = scanner.nextInt();
        System.out.print("Enter the height:");
        int height = scanner.nextInt();
        HinhChuNhat hcn = new HinhChuNhat(width, height);
        System.out.println("Your Rectangle \n" + hcn.display());
        System.out.println("Perimeter of the Rectangle: " + hcn.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn.getArea());
    }
}
