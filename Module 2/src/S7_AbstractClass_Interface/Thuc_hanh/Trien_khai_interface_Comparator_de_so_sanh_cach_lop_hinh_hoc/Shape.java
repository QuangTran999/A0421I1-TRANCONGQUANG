package S7_AbstractClass_Interface.Thuc_hanh.Trien_khai_interface_Comparator_de_so_sanh_cach_lop_hinh_hoc;

public class Shape {
    public String color="green";
    public boolean filled=true;

    public Shape(){
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString(){
        return "A Shape with color of "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
