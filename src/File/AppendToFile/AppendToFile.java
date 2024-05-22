package File.AppendToFile;

import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\PC\\OneDrive\\Desktop\\input.txt";

        // Nội dung để theem vào tệp
        String[] contentToWrite = {
                "Đây là dòng đầu tiên.",
                "Đây là dòng thứ hai.",
                "Đây là dòng thứ ba."
        };
        try(FileWriter writer = new FileWriter(filePath)){
            for(String content : contentToWrite){
                writer.write(content + System.lineSeparator());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
