package S6_Ke_Thua.Bai_tap.Thiet_ke_va_trien_khai_lop_Triangle;
import java.util.Scanner;


public class Triangle extends Shape {
    Scanner input = new Scanner(System.in);
    public String color;

    Triangle(){
    }
    Triangle(double side1, double side2, double side3, String color){
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        System.out.print("Input color: ");
        String color = input.nextLine();
        this.color = color;
    }

    public double getArea(){
        return 4;
    }
    public double getPerimeter(){
        return 4;
    }
    public String toString(){
        return "";
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.setSide1();
        triangle.setSide2();
        triangle.setSide3();
    }
}
