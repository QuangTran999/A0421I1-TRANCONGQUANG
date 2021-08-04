package S4_Lop_va_Doi_Tuong_trong_java.Thuc_hanh.Lop_hinh_chu_nhat;

public class HinhChuNhat {
    int width;
    int height;
    HinhChuNhat(){

    }
    HinhChuNhat(int width, int height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
