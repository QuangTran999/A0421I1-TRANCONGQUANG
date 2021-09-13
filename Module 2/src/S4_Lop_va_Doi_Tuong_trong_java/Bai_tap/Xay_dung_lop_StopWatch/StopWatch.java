package S4_Lop_va_Doi_Tuong_trong_java.Bai_tap.Xay_dung_lop_StopWatch;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public StopWatch(){

    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return this.endTime-this.startTime;
    }

    public static void main(String[] args) {
        StopWatch st = new StopWatch();
        st.start();
        System.out.println(10000*777777777);
        st.stop();
        System.out.println(st.getElapsedTime());
    }
}
