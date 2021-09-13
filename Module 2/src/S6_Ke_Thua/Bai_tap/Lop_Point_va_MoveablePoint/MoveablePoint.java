package S6_Ke_Thua.Bai_tap.Lop_Point_va_MoveablePoint;

public class MoveablePoint extends Point {
    public float xSpeed;
    public float ySpeed;

    MoveablePoint(){
    }
    MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] arr = new float[2];
        arr[0] = xSpeed;
        arr[1] = ySpeed;
        return arr;
    }

    public String toString(){
        return super.toString()+", Speed="+getxSpeed()+", "+getySpeed()+")";
    }

    public MoveablePoint move(){
        x += xSpeed;
        y += xSpeed;
        return this;
    }

}

