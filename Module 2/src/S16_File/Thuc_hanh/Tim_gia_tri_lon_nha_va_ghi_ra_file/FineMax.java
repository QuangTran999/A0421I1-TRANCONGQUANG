package S16_File.Thuc_hanh.Tim_gia_tri_lon_nha_va_ghi_ra_file;
import java.io.*;


public class FineMax {
    public static void fineMax(String path) throws IOException{
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        int max = 0;
        try {
            fileReader = new FileReader(new File(path));
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!=null){
                if (max<Integer.parseInt(line)){
                    max = Integer.parseInt(line);
                }
            }
        }finally {
            fileReader.close();
            bufferedReader.close();
        }
        try {
            FileWriter fileWriter = new FileWriter("sample\\A0421I1\\sample2.txt", true);
            fileWriter.write("max value is: " + max);
            fileWriter.close();
        }finally {

        }
    }

    public static void main(String[] args) {
        try {
            fineMax("sample\\A0421I1\\sample1.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
