package S6_Ke_Thua.Bai_tap.Lop_Point2D_va_lop_Point3D;

public class Point2D {
    public float x;
    public float y;

    Point2D(){
    }
    Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] arr = new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }
    public String toString(){
        return "("+getX()+", "+getY()+")";
    }
}
