package S6_Ke_Thua.Thuc_hanh.He_Cac_Doi_Tuong_Hinh_Hoc;

public class Shape {
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
}
