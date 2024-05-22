package File.ReadFileAndStoreInArray;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;


public class ReadFileAndStoreInArray {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\PC\\OneDrive\\Desktop\\input.txt";

        // Nội dung để ghi vào tệp
        String[] contentToWrite = {
                "Đây là dòng đầu tiên.",
                "Đây là dòng thứ hai.",
                "Đây là dòng thứ ba."
        };

        try(FileWriter  writer = new FileWriter(filePath)){
            for(String content : contentToWrite){
                writer.write(content + System.lineSeparator());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
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
