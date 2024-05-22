package File.FileToByteArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileToByteArray {
    public static void main(String[] args) {
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";
        File file = new File(filePath);
        byte[] fileContent = null;
        try(FileInputStream fis = new FileInputStream(file)){
            fileContent = new byte[(int) file.length()];
            int bytesRead = fis.read(fileContent);
            if(bytesRead != fileContent.length){
                throw new IOException("Could not read " + filePath);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        if(fileContent != null){
            String fileContentStr = new String(fileContent);
            System.out.println(fileContentStr);
        }

    }
}
