package S16_File.Tong_quat.Demo;

import java.io.File;

public class DemoFile {
    public static void main(String[] args) {
//        File file = new File("foo.txt");
//        System.out.println("File ton tai hay khong: " + file.exists());
//        System.out.println("Path: " + file.getAbsolutePath());
        File file = new File("sample\\A0421I1");
//        System.out.println("Tao file thanh cong: " + file.mkdir());
//        System.out.println("Xoa file thanh cong: " + file.delete());
        System.out.println("Tao file thanh cong: " + file.mkdirs());
    }
}
