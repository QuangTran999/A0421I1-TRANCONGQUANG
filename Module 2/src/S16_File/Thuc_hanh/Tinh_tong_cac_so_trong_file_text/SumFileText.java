package S16_File.Thuc_hanh.Tinh_tong_cac_so_trong_file_text;

import java.io.*;

public class SumFileText {
    public static void sumFile(String path) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int sum = 0;
        try {
            fileReader = new FileReader(new File(path));
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                sum = sum + Integer.parseInt(line);
            }
        }finally {
            fileReader.close();
            bufferedReader.close();
        }
        System.out.println("Tổng các phần tử trong file: "+sum);
    }

    public static void main(String[] args) throws IOException {
        sumFile("sample\\A0421I1\\sample1.txt");
    }
}
