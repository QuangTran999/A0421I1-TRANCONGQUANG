package S7_AbstractClass_Interface.Bai_tap.trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();

        System.out.println("The way to fill");
        for (Shape shape:shapes){
            shape.howToColor();
        }
    }
}
