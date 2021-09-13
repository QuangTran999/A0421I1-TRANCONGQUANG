package S7_AbstractClass_Interface.Bai_tap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Shape implements Resizeable {
    public String color="green";
    public boolean filled=true;

    Shape(){
    }
    Shape(String color, boolean filled){
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

    @Override
    public void resize(double percent) {

    }
}
