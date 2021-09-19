package S16_File.Bai_tap.Doc_File_CSV;
import java.io.*;

public class ReadFile {
    public static void readCSV(String path) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(new File(path));
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                String[] split = line.split(",",3);
                System.out.println(split[2] + "\n");
            }
        } finally {
            fileReader.close();
            bufferedReader.close();
            System.out.println("Finish");
        }
    }

    public static void main(String[] args) throws IOException {
        readCSV("sample\\A0421I1\\sample2.csv");
    }
}
