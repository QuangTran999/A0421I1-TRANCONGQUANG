package S6_Ke_Thua.Bai_tap.Thiet_ke_va_trien_khai_lop_Triangle;
import java.util.Scanner;

public class Shape {
    Scanner input = new Scanner(System.in);
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    Shape(){
    }
    Shape(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(){
        System.out.print("Input side1: ");
        double side1 = input.nextDouble();
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(){
        System.out.print("Input side2: ");
        double side2 = input.nextDouble();
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(){
        System.out.print("Input side3: ");
        double side3 = input.nextDouble();
        this.side3 = side3;
    }


}
