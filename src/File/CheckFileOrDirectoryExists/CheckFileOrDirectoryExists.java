package File.CheckFileOrDirectoryExists;
import java.io.File;

public class CheckFileOrDirectoryExists {
    public static void main(String[] args) {
        String directoryPath = "E:\\Download";
        File file = new File(directoryPath);
        if(file.exists()) {
            System.out.println("Directory exists");
        }else{
            System.out.println("Directory not exists");
        }

    }
}
