package S7_AbstractClass_Interface.Bai_tap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Rectangle extends Shape implements Resizeable {
    public double width = 1.0;
    public double length = 1.0;

    Rectangle(){
    }

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled ){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width*this.length;
    }

    public double getPerimeter(){
        return 2*(getLength() + getWidth());
    }

    public String toString(){
        return "A Rectangle with width= "+getWidth()+
                " and length="+getLength()+
                ", which is a subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.getArea());
    }

    @Override
    public void resize(double percent) {
        this.width += this.width*percent;
        this.length += this.length*percent;
    }
}
