package S6_Ke_Thua.Bai_tap.Lop_Circle_va_lop_Cylinder;

public class Circle {
    public double radius;
    public String color;

    Circle(){
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        return "radius "+getRadius()+" color: "+getColor();
    }
}
