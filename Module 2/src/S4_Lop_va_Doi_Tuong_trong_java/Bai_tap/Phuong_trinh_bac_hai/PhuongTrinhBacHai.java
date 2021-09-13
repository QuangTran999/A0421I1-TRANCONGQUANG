package S4_Lop_va_Doi_Tuong_trong_java.Bai_tap.Phuong_trinh_bac_hai;
import java.util.Scanner;

public class PhuongTrinhBacHai {
    private double a;
    private double b;
    private double c;

    PhuongTrinhBacHai(){

    }
    PhuongTrinhBacHai(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return (this.b*this.b-4*this.a*this.c);
    }

    public double getRoot1(){
        return (-this.b + Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);
    }

    public double getRoot2(){
        return (-this.b - Math.sqrt(this.b*this.b - 4*this.a*this.c))/(2*this.a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PhuongTrinhBacHai pt = new PhuongTrinhBacHai(1,-2,1);
        double delta = pt.getDiscriminant();
        if (delta>0){
            System.out.println("Phương trình có 2 nghiệm phân biết: ");
            System.out.println("x1 = "+pt.getRoot1());
            System.out.println("x2 = "+pt.getRoot2());
        }else if (delta == 0){
            System.out.println("Phương trình có một nghiệm duy nhất: ");
            System.out.println("x = "+pt.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
