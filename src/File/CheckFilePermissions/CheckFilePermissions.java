package File.CheckFilePermissions;

import java.io.File;

public class CheckFilePermissions {
    public static void main(String[] args) {
        String directoryPath = "E:\\Download";

        File file = new File(directoryPath);

        // check read and write permissions
        if(file.exists()) {
            if(file.canRead()) {
                System.out.println("File can read");
            }else{
                System.out.println("File can not read");
            }
            if(file.canWrite()) {
                System.out.println("File can write");
            }else{
                System.out.println("File can not write");
            }
        }else{
            System.out.println("File not found");
        }

    }
}
