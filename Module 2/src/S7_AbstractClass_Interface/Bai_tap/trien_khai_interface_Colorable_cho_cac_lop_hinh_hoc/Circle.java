package S7_AbstractClass_Interface.Bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;


public class Circle extends Shape  {
    public double radius = 1.0;

    Circle(){
    }
    Circle(double radius){
        this.radius = radius;
    }
    Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius*3.14;
    }

    public double getPerimeter(){
        return 2*radius*3.14;
    }

    public String toString(){
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Fill in the border of the circle");
    }
}
