package File.CheckIsFileOrDirectory;

import java.io.File;

public class CheckIsFileOrDirectory{
    public static void main(String[] args) {
        String directoryPath = "E:\\Download";
        String filePath = "E:\\Download\\PhieuDGRL_MOI.docx";

        File directory = new File(directoryPath);
        File file = new File(filePath);

        if(directory.isDirectory()) {
            System.out.println("A Directory");
        }else{
            System.out.println("Not a directory");
        }
        if(file.isFile()) {
            System.out.println("A File");
        }else{
            System.out.println("Not a File");
        }
    }
}
