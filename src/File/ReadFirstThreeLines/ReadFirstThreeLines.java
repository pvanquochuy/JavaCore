package File.ReadFirstThreeLines;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFirstThreeLines {
    public static void main(String[] args){
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            int numberLine = 0;
            while ((line = reader.readLine()) != null && numberLine < 3) {
                System.out.println(line);
                numberLine++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
