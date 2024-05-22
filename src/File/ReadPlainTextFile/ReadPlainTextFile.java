package File.ReadPlainTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
