package S16_File.Bai_tap.Copy_File_Text;
import java.io.*;

public class CopyFile {
    private static void copyFile(String source, String dest) throws IOException {
        FileReader reader = null;
        FileWriter writer = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            reader = new FileReader(source);
            writer = new FileWriter(dest);
            bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }
        } finally {
            reader.close();
            writer.close();
            bufferedReader.close();
        }
    }

    public static void main(String[] args) {
        try {
            copyFile("sample1\\A0421I1\\sample1.txt", "sample\\A0421I1\\sample3.txt");
        }catch (IOException e){
            System.out.println("Not Fine source");
        }
    }
}
