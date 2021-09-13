package S15_Xu_lu_ngoai_le_va_debug.Bai_tap.Su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();

        System.out.println("Hãy nhập y: ");
        int z = scanner.nextInt();

        Triangle tr = new Triangle();
        tr.IllegalTriangleException(x,y,z);
    }
    private void IllegalTriangleException(int x, int y, int z){
        try {
            if (x>0 && y>0 && z>0 && x+y>z && x+z>y && y+z>x){
                System.out.println("x,y,z>0");
            }else {
                int t = 1/0;
                System.out.println(t);
            }
        }catch (Exception e){
            System.out.println("IllegalTriangleException");
        }
    }
}
