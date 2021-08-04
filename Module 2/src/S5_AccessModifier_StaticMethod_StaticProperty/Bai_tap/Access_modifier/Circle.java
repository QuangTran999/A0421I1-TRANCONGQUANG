package S5_AccessModifier_StaticMethod_StaticProperty.Bai_tap.Access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){
    }

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return this.radius*this.radius;
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Radius is :"+c.getRadius());
        System.out.println("Area is: "+c.getArea());
    }
}
